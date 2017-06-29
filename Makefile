# Project name
NAME=BlackJack
MAIN_CLASS_NAME:=$(NAME)


# Directories
# LIBDIR=lib
BLDDIR=build
SRCDIR=src

# If the first argument is "run"
ifeq (run, $(firstword $(MAKECMDGOALS)))
  # use the rest as arguments for "run"
  RUN_ARGS := $(wordlist 2, $(words $(MAKECMDGOALS)), $(MAKECMDGOALS))
  # ...and turn them into do-nothing targets
  $(eval $(RUN_ARGS):;@:)
endif


# Search for source files
SRC=$(shell find -name "*.java")


CC=javac
#CFLAGS=-O3 -I./$(INCDIR)

USER_LIBS=
DEFAULT_LIBS=
LIBS=$(USER_LIBS) $(DEFAULT_LIBS)

ifdef debug
	CFLAGS += -Xlint
endif

# GIT_STAT:=$(shell echo -e "GET http://github.com HTTP/1.0\n\n" | nc google.com 80 > /dev/null 2>&1; echo $$?)

all: checkname checkdirs clean main

.PHONY: main
main: 
	@$(CC) -d $(BLDDIR) $(SRC) $(JAVAFLAGS)

# Run directives
.PHONY: run
run:
	java -classpath $(BLDDIR) $(NAME)

# Utility directives
.PHONY: clean
clean: checkname
	-rm -f $(BLDDIR)/*
	-rm -f vgcore*
	-rm -f $(NAME).zip
	-rm -f $(NAME).tar.gz
	clear
	clear

cleanobj: 
	-rm -f $(OBJDIR)/*.o

.PHONY: list
list: 
	clear
	ls -lhR

.PHONY: tar
tar: checkname clean cleanobj
	@echo Compressing files...
	@tar -zcvf $(NAME).tar.gz *
	@echo Done.

.PHONY: zip
zip: checkname clean cleanobj
	@echo Compressing files...
	@zip -r $(NAME).zip *
	@echo Done.

.PHONY: git-show
git-show:
	git log --graph --full-history --all --pretty=format:"%h%x09%d%x20%s"

sense:
	$(error Doesnt make sense)

.PHONY: readme
readme: checkname
	@echo "# Makefile" >> $(NAME)/README.md
	@echo "" >> $(NAME)/README.md
	@echo "\`\`\`Makefile" >> $(NAME)/README.md
	@echo "all: compile project" >> $(NAME)/README.md
	@echo "run: run executable" >> $(NAME)/README.md
	@echo "clean: clean object files and zip/tar" >> $(NAME)/README.md
	@echo "list: list all project's directories and files" >> $(NAME)/README.md
	@echo "zip/tar: compress project folder" >> $(NAME)/README.md
	@echo "update: update makefile" >> $(NAME)/README.md
	@echo "readme: generate this readme" >> $(NAME)/README.md
	@echo "create: create project structure" >> $(NAME)/README.md
	@echo "\`\`\`" >> $(NAME)/README.md
	@echo "" >> $(NAME)/README.md
	@echo "" >> $(NAME)/README.md
	@echo "Set \`debug=1\` to compile/run in debug mode  " >> $(NAME)/README.md
	@echo "Set \`IN=filename\` to feed a file to the program  " >> $(NAME)/README.md
	@echo "Set \`OUT=filename\` to write program output to designed file  " >> $(NAME)/README.md
	@echo "Use \`CFLAGS+=flags\` to add compiler flags  " >> $(NAME)/README.md
	@echo "Set \`CC=compiler\` to change compiler  " >> $(NAME)/README.md
	@echo "Set \`NAME=name\` to set project name  " >> $(NAME)/README.md
	@echo "Set \`USER_LIBS=libraries\` to set user-defined libraries  " >> $(NAME)/README.md
	@echo "" >> $(NAME)/README.md

# Check for directory existence and create them if necessary
checkdirs: 
	if [ ! -d $(BLDDIR)/ ]; then mkdir -p $(BLDDIR)/; fi
	# if [ ! -d $(LIBDIR)/ ]; then mkdir -p $(LIBDIR)/; fi
	if [ ! -d $(SRCDIR)/ ]; then mkdir -p $(SRCDIR)/; fi

# Check if project has a name
checkname: 
ifeq ($(strip $(NAME)),)
	$(error No project name provided (open this make and set NAME))
else
	@echo
endif

# .PHONY: update
# update:
# 	@echo Updating Makefile...
# 	git clone git@github.com:lucas1131/MakefileGit.git
# 	cp MakefileGit/Makefile .
# 	-rm -rf MakefileGit/

create: checkname
	@echo Creating directories...
	@mkdir $(NAME) 
	@mkdir $(NAME)/$(SRCDIR)
	# @mkdir $(NAME)/$(LIBDIR)
	@mkdir $(NAME)/$(BLDDIR)

	cp ./Makefile $(NAME)/
	@echo Generating README...
	$(MAKE) readme

package:
ifeq ($(strip $(pkg)),)
	$(error No package specified)
endif
	mkdir $(SRCDIR)/$(pkg)

remove_package:
ifeq ($(strip $(pkg)),)
	$(error No package specified)
endif
	rm -rf $(SRCDIR)/$(pkg)

