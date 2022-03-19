
package lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;

import java.io.LineNumberReader;

/**
 *
 * @author rimsh
 */


public class LexerAnalyzerJFrame extends javax.swing.JFrame {

   
    public LexerAnalyzerJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        DisplayCodeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeArea = new javax.swing.JTextArea();
        Codelabel = new javax.swing.JLabel();
        FunctionLabel = new javax.swing.JLabel();
        Keywordbtn = new javax.swing.JButton();
        OutputLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultArea = new javax.swing.JTextArea();
        Operatorsbtn = new javax.swing.JButton();
        Seperatorbtn = new javax.swing.JButton();
        Identifierbtn = new javax.swing.JButton();
        Integerbtn = new javax.swing.JButton();
        charbtn = new javax.swing.JButton();
        Stringbtn = new javax.swing.JButton();
        Multilinebtn = new javax.swing.JButton();
        Signlecommentbtn = new javax.swing.JButton();
        Realbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Heading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Heading.setText("Lexer Analyzer");
        jPanel1.add(Heading);
        Heading.setBounds(200, 30, 233, 44);

        DisplayCodeButton.setBackground(new java.awt.Color(102, 102, 255));
        DisplayCodeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DisplayCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        DisplayCodeButton.setText("Choose Text File");
        DisplayCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCodeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayCodeButton);
        DisplayCodeButton.setBounds(250, 100, 140, 40);

        CodeArea.setColumns(20);
        CodeArea.setRows(5);
        jScrollPane1.setViewportView(CodeArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 170, 420, 220);

        Codelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Codelabel.setText("Code will display here");
        jPanel1.add(Codelabel);
        Codelabel.setBounds(20, 180, 140, 20);

        FunctionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FunctionLabel.setText("Token Categorization with line number and will also remove comments");
        jPanel1.add(FunctionLabel);
        FunctionLabel.setBounds(410, 450, 440, 30);

        Keywordbtn.setBackground(new java.awt.Color(102, 102, 255));
        Keywordbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Keywordbtn.setForeground(new java.awt.Color(255, 255, 255));
        Keywordbtn.setText("Keyword");
        Keywordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeywordbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Keywordbtn);
        Keywordbtn.setBounds(760, 500, 120, 50);

        OutputLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OutputLabel.setText("Output will show here");
        jPanel1.add(OutputLabel);
        OutputLabel.setBounds(600, 170, 150, 17);

        ResultArea.setColumns(20);
        ResultArea.setRows(5);
        jScrollPane2.setViewportView(ResultArea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(750, 170, 420, 260);

        Operatorsbtn.setBackground(new java.awt.Color(102, 102, 255));
        Operatorsbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Operatorsbtn.setForeground(new java.awt.Color(255, 255, 255));
        Operatorsbtn.setText("Operators ");
        Operatorsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatorsbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Operatorsbtn);
        Operatorsbtn.setBounds(760, 580, 130, 50);

        Seperatorbtn.setBackground(new java.awt.Color(102, 102, 255));
        Seperatorbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seperatorbtn.setForeground(new java.awt.Color(255, 255, 255));
        Seperatorbtn.setText("Seperators");
        Seperatorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeperatorbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Seperatorbtn);
        Seperatorbtn.setBounds(560, 580, 120, 50);

        Identifierbtn.setBackground(new java.awt.Color(102, 102, 255));
        Identifierbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Identifierbtn.setForeground(new java.awt.Color(255, 255, 255));
        Identifierbtn.setText("Identifier");
        Identifierbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentifierbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Identifierbtn);
        Identifierbtn.setBounds(390, 500, 130, 50);

        Integerbtn.setBackground(new java.awt.Color(102, 102, 255));
        Integerbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Integerbtn.setForeground(new java.awt.Color(255, 255, 255));
        Integerbtn.setText("Integers");
        Integerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegerbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Integerbtn);
        Integerbtn.setBounds(200, 500, 130, 50);

        charbtn.setBackground(new java.awt.Color(102, 102, 255));
        charbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        charbtn.setForeground(new java.awt.Color(255, 255, 255));
        charbtn.setText("Char");
        charbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charbtnActionPerformed(evt);
            }
        });
        jPanel1.add(charbtn);
        charbtn.setBounds(210, 580, 100, 50);

        Stringbtn.setBackground(new java.awt.Color(102, 102, 255));
        Stringbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Stringbtn.setForeground(new java.awt.Color(255, 255, 255));
        Stringbtn.setText("String");
        Stringbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StringbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Stringbtn);
        Stringbtn.setBounds(560, 500, 120, 50);

        Multilinebtn.setBackground(new java.awt.Color(102, 102, 255));
        Multilinebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Multilinebtn.setForeground(new java.awt.Color(255, 255, 255));
        Multilinebtn.setText("Multiline");
        Multilinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultilinebtnActionPerformed(evt);
            }
        });
        jPanel1.add(Multilinebtn);
        Multilinebtn.setBounds(940, 500, 110, 60);

        Signlecommentbtn.setBackground(new java.awt.Color(102, 102, 255));
        Signlecommentbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Signlecommentbtn.setForeground(new java.awt.Color(255, 255, 255));
        Signlecommentbtn.setText("Single");
        Signlecommentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignlecommentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Signlecommentbtn);
        Signlecommentbtn.setBounds(940, 570, 110, 60);

        Realbtn.setBackground(new java.awt.Color(102, 102, 255));
        Realbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Realbtn.setForeground(new java.awt.Color(255, 255, 255));
        Realbtn.setText("Real");
        Realbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Realbtn);
        Realbtn.setBounds(390, 580, 120, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1210, 670);

        setBounds(0, 0, 1226, 709);
    }// </editor-fold>//GEN-END:initComponents

   

    private void DisplayCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCodeButtonActionPerformed
        
        JFileChooser chooser = new JFileChooser(); //Using for choose file from the PC
        chooser.showOpenDialog(null); //This will show the dialog box where we select the file
        File file = chooser.getSelectedFile(); //For slecetinjg file
        String filename = file.getAbsolutePath(); //Retrive the seleced file path
       
        try{
            
           FileReader reader = new FileReader(filename); //Read the selected file 
            BufferedReader breader = new BufferedReader(reader); // For temporarly store in variable and
            CodeArea.read(breader, null); // read the file and write on text area
            breader.close();
            CodeArea.requestFocus();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_DisplayCodeButtonActionPerformed

    private void KeywordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeywordbtnActionPerformed
        
  //Extracting and displaying the reserved keywords from attached file
  
       String input = CodeArea.getText();
       
       if (input.isEmpty()){
           
           ResultArea.setText("This file has no content");
       }
       
      
       
       else if (input.contains(input))
           
       {
           
            String input1 = CodeArea.getText(); 
        String line1[] = input1.split(" ");
        
         ResultArea.append("\n\n" + "Reserved Keywords" + "\n\n");
         
         for (int iterative = 0; iterative <= line1.length; iterative++){
                  
               switch(line1[iterative]){
               // Reserved keyword start from here
                  
                  case "abstract":
                       ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                        break;
                        
                   case "continue":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "for":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "new":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "switch":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "assert":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "default":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "goto":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "package":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "synchronized":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "boolean":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "do":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "if":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "private":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "this":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "break":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "double":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "implements":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "protected":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "throw":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "bytes":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "else":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "import":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "throws":  
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "case":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "enum":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "instnaceof":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "return":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "transient":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "catch":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "extends":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "int":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "short":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "try":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "char":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "final":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "interface":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "static":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "var":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "class":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "finally":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "long":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "strictfp":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "void":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "const":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "float":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "native":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "super":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "volatile":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "while":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "public":
                       ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;  
                   case "System":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "out":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "println":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "scanf":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "String":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                   case "args":
                        ResultArea.append("Reserved Keyword " + "  " + line1[iterative]+ "\n");
                         break;
                       
                  
               }
         }
              
          
       }
                 
    }//GEN-LAST:event_KeywordbtnActionPerformed

    private void OperatorsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperatorsbtnActionPerformed
        
        //Extracting and displaying the Operators from attached file
        
        String input1 = CodeArea.getText(); 
        String finalinput1[] = input1.split("");
        
         ResultArea.append("\n\n" + "Operators" + "\n\n");
        for (int iterative =0; iterative<= finalinput1.length; iterative++){
               
                 switch(finalinput1[iterative]){
               
                 // Operators start from here
                   
                   case "+":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                      
                         break;
                   case "-":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "*":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "/":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "%":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "^":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "&":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "|":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "!":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "~":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "+=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "-=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "*=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "/=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "%=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "^=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "++":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "--":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "==":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "!=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "<":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case ">":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "&=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case ">>=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "<<=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case ">=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "<=":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "||":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "&&":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case ">>":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "<<":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
                   case "?:":
                       ResultArea.append("Operators" + "  " + finalinput1[iterative]+ "\n");
                         break;
              
                 }
        }
    
   
        
        
    }//GEN-LAST:event_OperatorsbtnActionPerformed

    private void SeperatorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeperatorbtnActionPerformed
        
        //Extracting and displaying the Seperators from attached file
        
        String input2 = CodeArea.getText(); 
        String finalinput2[] = input2.split("");
        
        
         ResultArea.append("\n\n" + "Seperators" + "\n\n");
        
        for (int iterative =0; iterative<= finalinput2.length; iterative++){
               
                 switch(finalinput2[iterative]){
                     
                      //Sperators start from here 
                         
                   case "[":
                        ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case "]":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case "(":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case ")":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case "{":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case "}":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case ",":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case ";":
                       ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case ".":
                         ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break;
                   case "'":    
                          ResultArea.append("Seperators" + "  " + finalinput2[iterative]+ "\n");
                         break; 
                  
               }
                     
        }
        
    }//GEN-LAST:event_SeperatorbtnActionPerformed

    
    
    private void IdentifierbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentifierbtnActionPerformed
        
        //Extracting and displaying the Identifier from attached file
      
        String input2 = CodeArea.getText(); 
        String finalinput2[] = input2.split(" ");
        
         ResultArea.append("\n\n" + "Identifier" + "\n\n");
         
        for (int iterative =0; iterative<= finalinput2.length; iterative++){
            
        Scanner scan = new Scanner(finalinput2[iterative]);
        
      while (scan.hasNext()) {                     
            String identifier = scan.next();
            String string = "[_a-zA-Z][_a-zA-Z0-9]*";
       if (identifier.matches(string)){
         
            
            ResultArea.append("Identifier" + "  " + identifier + "\n");
       }
        }
       
        }
        
    }//GEN-LAST:event_IdentifierbtnActionPerformed

    private void IntegerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegerbtnActionPerformed
       
        //Extracting and displaying the integers from attached file
        
          String input2 = CodeArea.getText(); 
        String finalinput2[] = input2.split(" ");
        
         ResultArea.append("\n\n" + "Integers" + "\n\n");
         
        for (int iterative =0; iterative<= finalinput2.length; iterative++){
            
        Scanner scan = new Scanner(finalinput2[iterative]);
        
       
       
      while (scan.hasNext()) {                     
            String integer = scan.next();
            String string = "[0-9]+";
       if (integer.matches(string)){
         
            
            ResultArea.append("Integers" + "  " + integer + "\n");
       }
        }
        
        }
    }//GEN-LAST:event_IntegerbtnActionPerformed

    private void charbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charbtnActionPerformed
        
        //Extracting and displaying the Characters from attached file
        
          String input2 = CodeArea.getText(); 
   
        
         ResultArea.append("\n\n" + "Characters" + "\n\n");
            Scanner scan = new Scanner(input2);
               String input3 = input2.replaceAll("\"[^\"]+\"" , "");
            
                  ResultArea.append("Characters" + input3.matches("\"[^\"]+\"") );
                  
             ResultArea.append("Characters" + input3 );
             
        
        
    }//GEN-LAST:event_charbtnActionPerformed

    private void StringbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StringbtnActionPerformed
        
       //Extracting and displaying the strings from attached file
        
        String input2 = CodeArea.getText(); 
   
        
         ResultArea.append("\n\n" + "String" + "\n\n");
            Scanner scan = new Scanner(input2);
               String input3 = input2.replaceAll("\"[^\"]+\"" , "");
            
                  ResultArea.append("String" + input3.matches("\"[^\"]+\"") );
                  
             ResultArea.append("String" + input3 );
             
    }//GEN-LAST:event_StringbtnActionPerformed

    private void MultilinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultilinebtnActionPerformed
        
        //Removing multiline comments from text file 
        
         String input2 = CodeArea.getText(); 
     
         ResultArea.append("\n\n" + "Multiline" + "\n\n");
           
        Scanner scan = new Scanner(input2);
    String input3 = input2.replaceAll("/\\*(?:.|[\\n\\r])*?\\*/" , "");
        ResultArea.append( input3 );
        
   
    }//GEN-LAST:event_MultilinebtnActionPerformed

    private void SignlecommentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignlecommentbtnActionPerformed
       
         //Removing signle line comments from text file
          
         String input2 = CodeArea.getText(); 
   
         ResultArea.append("\n\n" + "singleline" + "\n\n");
       
        Scanner s = new Scanner(input2);
    String input3 = input2.replaceAll("//.*" , "");
        ResultArea.append( input3 );
        
        
        
    }//GEN-LAST:event_SignlecommentbtnActionPerformed

    private void RealbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealbtnActionPerformed
        
         //Extracting and displaying the strings from attached file
        
           String input2 = CodeArea.getText(); 
       
        Scanner scan = new Scanner(input2);
        
      int count = 0;
       
      while (scan.hasNext()) {                     
            String real = scan.next();
            String string = "[+-]?[0-9]+";
              
             count = count+1;
        
       if (real.matches(string)){
         
            ResultArea.append("index numbers" + "  " + count + "\n");
            ResultArea.append("real numbers" + "  " + real + "\n");
       }
       
        }
       
    }//GEN-LAST:event_RealbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LexerAnalyzerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LexerAnalyzerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LexerAnalyzerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LexerAnalyzerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LexerAnalyzerJFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CodeArea;
    private javax.swing.JLabel Codelabel;
    private javax.swing.JButton DisplayCodeButton;
    private javax.swing.JLabel FunctionLabel;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Identifierbtn;
    private javax.swing.JButton Integerbtn;
    private javax.swing.JButton Keywordbtn;
    private javax.swing.JButton Multilinebtn;
    private javax.swing.JButton Operatorsbtn;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JButton Realbtn;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JButton Seperatorbtn;
    private javax.swing.JButton Signlecommentbtn;
    private javax.swing.JButton Stringbtn;
    private javax.swing.JButton charbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

