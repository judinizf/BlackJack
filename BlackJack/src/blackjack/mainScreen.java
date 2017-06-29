/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Vector;
/**
 *
 * @author juvest
 */
public class mainScreen extends javax.swing.JFrame {

    /**
     * Creates new form mainScreen
     */
    Player player;
    Dealer dealer;
    static Deck deck;
    private int dificuldade;
    private int bet;
    private boolean firstbet = true;
    //Hand hand;

    private static final int[] BETS = {0, 10, 25, 50, 100};
    
    public mainScreen(int dificuldade) {
        this.dificuldade = dificuldade;
        player = new Player();
        dealer = new Dealer();
        deck = new Deck(dificuldade);
        deck.shuffleDeck();
        initComponents();
    }

    private mainScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        PlayerCards = new javax.swing.JPanel();
        PCard1 = new javax.swing.JLabel();
        PCard2 = new javax.swing.JLabel();
        PCard3 = new javax.swing.JLabel();
        PCard4 = new javax.swing.JLabel();
        PCard5 = new javax.swing.JLabel();
        PCard6 = new javax.swing.JLabel();
        PCard7 = new javax.swing.JLabel();
        DealerCards = new javax.swing.JPanel();
        DCard1 = new javax.swing.JLabel();
        DCard2 = new javax.swing.JLabel();
        DCard3 = new javax.swing.JLabel();
        DCard4 = new javax.swing.JLabel();
        DCard5 = new javax.swing.JLabel();
        DCard6 = new javax.swing.JLabel();
        DCard7 = new javax.swing.JLabel();
        Buy = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Double = new javax.swing.JButton();
        Surrender = new javax.swing.JButton();
        BET = new javax.swing.JComboBox<>();
        PlayerPoints = new javax.swing.JLabel();
        DealerPoints = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PMoney = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PBet = new javax.swing.JLabel();
        WIN = new javax.swing.JLabel();
        LOSE = new javax.swing.JLabel();
        Next = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 45, 11));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        PlayerCards.setBackground(new java.awt.Color(45, 105, 57));
        PlayerCards.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(1, 1, 1))); // NOI18N
        PlayerCards.setForeground(new java.awt.Color(51, 117, 191));
        PlayerCards.setLayout(new java.awt.GridBagLayout());
        PlayerCards.add(PCard1, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard2, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard3, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard4, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard5, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard6, new java.awt.GridBagConstraints());
        PlayerCards.add(PCard7, new java.awt.GridBagConstraints());

        DealerCards.setBackground(new java.awt.Color(45, 105, 57));
        DealerCards.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dealer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(1, 1, 1))); // NOI18N
        DealerCards.setForeground(new java.awt.Color(0, 42, 8));
        DealerCards.setLayout(new java.awt.GridBagLayout());
        DealerCards.add(DCard1, new java.awt.GridBagConstraints());
        DealerCards.add(DCard2, new java.awt.GridBagConstraints());
        DealerCards.add(DCard3, new java.awt.GridBagConstraints());
        DealerCards.add(DCard4, new java.awt.GridBagConstraints());
        DealerCards.add(DCard5, new java.awt.GridBagConstraints());
        DealerCards.add(DCard6, new java.awt.GridBagConstraints());
        DealerCards.add(DCard7, new java.awt.GridBagConstraints());

        Buy.setText("Buy");
        Buy.setEnabled(false);
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        Stop.setText("Stop");
        Stop.setEnabled(false);
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        Double.setText("Double");
        Double.setEnabled(false);
        Double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleActionPerformed(evt);
            }
        });

        Surrender.setText("Surrender");
        Surrender.setEnabled(false);
        Surrender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurrenderActionPerformed(evt);
            }
        });

        BET.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---  BET  ---", "R$ 10.00", "R$ 25.00", "R$ 50.00", "R$ 100.00" }));
        BET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BETActionPerformed(evt);
            }
        });

        PlayerPoints.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        PlayerPoints.setText("0");

        DealerPoints.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        DealerPoints.setText("0");

        jLabel1.setText("Money:");

        PMoney.setText("1000");

        jLabel2.setText("Bet:");

        PBet.setText("0");

        WIN.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        WIN.setText("WIN");
        WIN.setVisible(false);

        LOSE.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        LOSE.setText("LOSE");
        LOSE.setVisible(false);

        Next.setText("Next");
        Next.setVisible(false);
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Double)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Surrender)
                        .addGap(7, 7, 7)
                        .addComponent(BET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DealerCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlayerCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DealerPoints)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayerPoints)
                        .addGap(158, 158, 158)
                        .addComponent(WIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LOSE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PMoney)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBet)
                        .addGap(216, 216, 216))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(DealerPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DealerCards, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addComponent(PlayerPoints))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WIN)
                                    .addComponent(LOSE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PMoney)
                            .addComponent(jLabel2)
                            .addComponent(PBet))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerCards, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy)
                    .addComponent(Stop)
                    .addComponent(Double)
                    .addComponent(Surrender)
                    .addComponent(BET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Next))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        // TODO add your handling code here:
        try{
            buyCard();
        }catch(Exception e){
            //lostGame();
            e.printStackTrace();
        }

        Double.setEnabled((firstbet = false));

    }//GEN-LAST:event_BuyActionPerformed

    private void buyCard() throws Exception{
        
        if(player.getPoints()>21){
            throw new Exception("Mão Estourada");
        }

        player.buyCard();
        PlayerPoints.setText(Integer.toString(player.getPoints()));
        //caso passe das duas primeiras cartas, deixa o botao de double nao clicavel

        // adiciona a carta na interface
        if(player.getPoints() > 21){
            lostGame();
        }
    }
    
    private void BETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BETActionPerformed
        
        // Not valid index (bet = 0)
        if(BET.getSelectedIndex() == 0)
            return;

        //bet = BET.getSelectedIndex() + 1;
        bet = BETS[BET.getSelectedIndex()];
        //depois disso o botao de BET nao pode mais ser clicado
        //try catch
        if(bet < player.getMoney()){
            player.initialHand();
            PlayerPoints.setText(Integer.toString(player.getPoints()));
            dealer.initialHand();
            DealerPoints.setText(Integer.toString(dealer.getPoints()));
            PBet.setText(Integer.toString(bet));
            // Coloca as cartas na interface
            //PlayerCards.setText(player.getCards());
            Buy.setEnabled(true);
            Double.setEnabled((firstbet = true));
            Stop.setEnabled(true);
            Surrender.setEnabled(true);
            BET.setEnabled(false);
        }
        
    }//GEN-LAST:event_BETActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        
        // Dealer compra cartas ate ficar com mais pontos que player
        while(dealer.getPoints() < player.getPoints()){

            System.out.println("[DEBUG]: dealer points: " + dealer.getPoints());
            dealer.buyCard();
            
            // Show dealer hand's points
            DealerPoints.setText(Integer.toString(dealer.getPoints()));

            // Dealer estourou
            if(dealer.getPoints() > 21){
                winGame();
                return;
            }
        }
        // Em empate, o dealer ganha
        if(dealer.getPoints() >= player.getPoints()){
            lostGame();
            return;
        }

    }//GEN-LAST:event_StopActionPerformed
   
        
    private void DoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleActionPerformed
        // TODO add your handling code here:
        bet *= 2;
        PBet.setText(Integer.toString(bet));
        Double.setEnabled((firstbet = false));
        try{
            buyCard();
        }catch(Exception e){
            // LOST GAME
            System.out.println("ESTOUROU");
        }
        Buy.setEnabled(false);
    }//GEN-LAST:event_DoubleActionPerformed

    private void SurrenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurrenderActionPerformed
        // TODO add your handling code here:
        // LOST GAME
    }//GEN-LAST:event_SurrenderActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        PlayerPoints.setText(Integer.toString(player.getPoints()));
        DealerPoints.setText(Integer.toString(player.getPoints()));
        PBet.setText(Integer.toString(bet));
        PMoney.setText(Integer.toString(player.getMoney()));
        
        Next.setVisible(false);
        Buy.setEnabled(false);
        Double.setEnabled(false);
        Stop.setEnabled(false);
        Surrender.setEnabled(false);
        BET.setEnabled(true);
        WIN.setVisible(false);
        LOSE.setVisible(false);
    }//GEN-LAST:event_NextActionPerformed

    private void winGame(){
        finishGame(true);
        WIN.setVisible(true);
    }

    private void lostGame(){
        finishGame(false);
        LOSE.setVisible(true);
    }
    
    private void finishGame(boolean win){
        if(win) player.winMoney(bet);
        else player.loseMoney(bet);
        
        player.removeHand();
        dealer.removeHand();
        bet = 0;
        Next.setVisible(true);
        Buy.setEnabled(false);
        Double.setEnabled(false);
        Stop.setEnabled(false);
        Surrender.setEnabled(false);
        BET.setEnabled(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new mainScreen(dificuldade).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BET;
    private javax.swing.JButton Buy;
    private javax.swing.JLabel DCard1;
    private javax.swing.JLabel DCard2;
    private javax.swing.JLabel DCard3;
    private javax.swing.JLabel DCard4;
    private javax.swing.JLabel DCard5;
    private javax.swing.JLabel DCard6;
    private javax.swing.JLabel DCard7;
    private javax.swing.JPanel DealerCards;
    private javax.swing.JLabel DealerPoints;
    private javax.swing.JButton Double;
    private javax.swing.JLabel LOSE;
    private javax.swing.JButton Next;
    private javax.swing.JLabel PBet;
    private javax.swing.JLabel PCard1;
    private javax.swing.JLabel PCard2;
    private javax.swing.JLabel PCard3;
    private javax.swing.JLabel PCard4;
    private javax.swing.JLabel PCard5;
    private javax.swing.JLabel PCard6;
    private javax.swing.JLabel PCard7;
    private javax.swing.JLabel PMoney;
    private javax.swing.JPanel PlayerCards;
    private javax.swing.JLabel PlayerPoints;
    private javax.swing.JButton Stop;
    private javax.swing.JButton Surrender;
    private javax.swing.JLabel WIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
