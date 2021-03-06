package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import controller.GerenciadorClientes;
import controller.Principal;
import controller.ValidadorCampos;

public class PainelCadastroClientePJ extends JPanel
{
    JTextField textFieldComplemento;
    JTextField textFieldCnpj;
    JFormattedTextField textFieldCep;
    
    public PainelCadastroClientePJ(String cnpj , JPanel painelPai)
    {
        setLayout(null);
        setPreferredSize(new Dimension(800 , 600));
        
        JPanel subPainel1 = new JPanel();
        subPainel1.setLayout(new BoxLayout(subPainel1 , BoxLayout.PAGE_AXIS));
        subPainel1.setBounds(132 , 107 , 200 , 250);;
        
        JPanel subPainel2 = new JPanel();
        subPainel2.setLayout(new BoxLayout(subPainel2 , BoxLayout.PAGE_AXIS));
        subPainel2.setBounds(465 , 107 , 200 , 250);
        
        JLabel labelRazaoSocial = new JLabel("Raz?o Social" , SwingConstants.LEFT);
        labelRazaoSocial.setPreferredSize(new Dimension(200 , 25));
        labelRazaoSocial.setMinimumSize(new Dimension(200 , 25));
        labelRazaoSocial.setMaximumSize(new Dimension(200 , 25));
        labelRazaoSocial.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel labelCnpj = new JLabel("CNPJ" , SwingConstants.LEFT);
        labelCnpj.setPreferredSize(new Dimension(200 , 25));
        labelCnpj.setMinimumSize(new Dimension(200 , 25));
        labelCnpj.setMaximumSize(new Dimension(200 , 25));
        labelCnpj.setAlignmentX(Component.CENTER_ALIGNMENT);

        subPainel1.add(labelCnpj);

        textFieldCnpj = new JTextField(cnpj);
        textFieldCnpj.setPreferredSize(new Dimension(200 , 25));
        textFieldCnpj.setMinimumSize(new Dimension(200 , 25));
        textFieldCnpj.setMaximumSize(new Dimension(200 , 25));
        textFieldCnpj.setAlignmentX(Component.CENTER_ALIGNMENT);
        textFieldCnpj.setEnabled(false);

        subPainel1.add(textFieldCnpj);
        
        
        JTextField textFieldRazaoSocial = new JTextField();
        textFieldRazaoSocial.setPreferredSize(new Dimension(200 , 25));
        textFieldRazaoSocial.setMinimumSize(new Dimension(200 , 25));
        textFieldRazaoSocial.setMaximumSize(new Dimension(200 , 25));
        textFieldRazaoSocial.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel1.add(labelRazaoSocial);
        subPainel1.add(textFieldRazaoSocial);
        
        JLabel labelTelefonePri = new JLabel("Telefone Principal" , SwingConstants.LEFT);
        labelTelefonePri.setPreferredSize(new Dimension(200 , 25));
        labelTelefonePri.setMinimumSize(new Dimension(200 , 25));
        labelTelefonePri.setMaximumSize(new Dimension(200 , 25));
        labelTelefonePri.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldTelefonePri = new JTextField();
        textFieldTelefonePri.setPreferredSize(new Dimension(200 , 25));
        textFieldTelefonePri.setMinimumSize(new Dimension(200 , 25));
        textFieldTelefonePri.setMaximumSize(new Dimension(200 , 25));
        textFieldTelefonePri.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel1.add(labelTelefonePri);
        subPainel1.add(textFieldTelefonePri);
        
        JLabel labelTelefoneSec = new JLabel("Telefone Secund?rio (opcional)" , SwingConstants.LEFT);
        labelTelefoneSec.setPreferredSize(new Dimension(200 , 25));
        labelTelefoneSec.setMinimumSize(new Dimension(200 , 25));
        labelTelefoneSec.setMaximumSize(new Dimension(200 , 25));
        labelTelefoneSec.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldTelefoneSec = new JTextField();
        textFieldTelefoneSec.setPreferredSize(new Dimension(200 , 25));
        textFieldTelefoneSec.setMinimumSize(new Dimension(200 , 25));
        textFieldTelefoneSec.setMaximumSize(new Dimension(200 , 25));
        textFieldTelefoneSec.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel1.add(labelTelefoneSec);
        subPainel1.add(textFieldTelefoneSec);
        
        JLabel labelEmail = new JLabel("Endere?o de e-mail (opcional)" , SwingConstants.LEFT);
        labelEmail.setPreferredSize(new Dimension(200 , 25));
        labelEmail.setMinimumSize(new Dimension(200 , 25));
        labelEmail.setMaximumSize(new Dimension(200 , 25));
        labelEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setPreferredSize(new Dimension(200 , 25));
        textFieldEmail.setMinimumSize(new Dimension(200 , 25));
        textFieldEmail.setMaximumSize(new Dimension(200 , 25));
        textFieldEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel1.add(labelEmail);
        subPainel1.add(textFieldEmail);        
        
        JLabel labelLogradouro = new JLabel("Logradouro" , SwingConstants.LEFT);
        labelLogradouro.setPreferredSize(new Dimension(200 , 25));
        labelLogradouro.setMinimumSize(new Dimension(200 , 25));
        labelLogradouro.setMaximumSize(new Dimension(200 , 25));
        labelLogradouro.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldLogradouro = new JTextField();
        textFieldLogradouro.setPreferredSize(new Dimension(200 , 25));
        textFieldLogradouro.setMinimumSize(new Dimension(200 , 25));
        textFieldLogradouro.setMaximumSize(new Dimension(200 , 25));
        textFieldLogradouro.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel2.add(labelLogradouro);
        subPainel2.add(textFieldLogradouro);        
        
        JLabel labelComplemento = new JLabel("Complemento");
        labelComplemento.setPreferredSize(new Dimension(200 , 25));
        labelComplemento.setMinimumSize(new Dimension(200 , 25));
        labelComplemento.setMaximumSize(new Dimension(200 , 25));
        labelComplemento.setAlignmentX(Component.CENTER_ALIGNMENT);

        subPainel2.add(labelComplemento);

        textFieldComplemento = new JTextField();
        textFieldComplemento.setPreferredSize(new Dimension(200 , 25));
        textFieldComplemento.setMinimumSize(new Dimension(200 , 25));
        textFieldComplemento.setMaximumSize(new Dimension(200 , 25));
        textFieldComplemento.setAlignmentX(Component.CENTER_ALIGNMENT);
        subPainel2.add(textFieldComplemento);
        
        JLabel labelBairro = new JLabel("Bairro" , SwingConstants.LEFT);
        labelBairro.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelBairro.setPreferredSize(new Dimension(200 , 25));
        labelBairro.setMinimumSize(new Dimension(200 , 25));
        labelBairro.setMaximumSize(new Dimension(200 , 25));
        textFieldEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldBairro = new JTextField();
        textFieldBairro.setPreferredSize(new Dimension(200 , 25));
        textFieldBairro.setMinimumSize(new Dimension(200 , 25));
        textFieldBairro.setMaximumSize(new Dimension(200 , 25));
        textFieldEmail.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel2.add(labelBairro);
        subPainel2.add(textFieldBairro);       
        
        JLabel labelCidade = new JLabel("Cidade" , SwingConstants.LEFT);
        labelCidade.setPreferredSize(new Dimension(200 , 25));
        labelCidade.setMinimumSize(new Dimension(200 , 25));
        labelCidade.setMaximumSize(new Dimension(200 , 25));
        labelCidade.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JTextField textFieldCidade = new JTextField();
        textFieldCidade.setPreferredSize(new Dimension(200 , 25));
        textFieldCidade.setMinimumSize(new Dimension(200 , 25));
        textFieldCidade.setMaximumSize(new Dimension(200 , 25));
        textFieldCidade.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel2.add(labelCidade);
        subPainel2.add(textFieldCidade);
        
        String[] estados = {"AC" , "AL" , "AM" , "AP" , "BA" , "CE" , "DF" , "ES" , "GO" , "MA" , "MG" , "MS" , "MT" ,
                            "PA" , "PB" , "PE" , "PI" , "PR" , "RJ" , "RN" , "RO" , "RR" , "RS" , "SC" , "SE"  , "SP" ,
                            "TO"};
        
        JLabel labelCep = new JLabel("CEP" , SwingConstants.LEFT);
        labelCep.setPreferredSize(new Dimension(200 , 25));
        labelCep.setMinimumSize(new Dimension(200 , 25));
        labelCep.setMaximumSize(new Dimension(200 , 25));
        labelCep.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        try
        {
            MaskFormatter mascaraCep = new MaskFormatter("#####-###");
            textFieldCep = new JFormattedTextField(mascaraCep);
            textFieldCep.setPreferredSize(new Dimension(200 , 25));
            textFieldCep.setMinimumSize(new Dimension(200 , 25));
            textFieldCep.setMaximumSize(new Dimension(200 , 25));
            textFieldCep.setAlignmentX(Component.CENTER_ALIGNMENT);
        }
        catch (ParseException e1)
        {
            
        }
        
        textFieldCep.setPreferredSize(new Dimension(200 , 25));
        textFieldCep.setMinimumSize(new Dimension(200 , 25));
        textFieldCep.setMaximumSize(new Dimension(200 , 25));
        textFieldCep.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        subPainel2.add(labelCep);
        subPainel2.add(textFieldCep);
        
        add(subPainel1);
        add(subPainel2);
        
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(132 , 384 , 200 , 25);
        
        botaoVoltar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                painelPai.add(new PainelCadastroCliente(painelPai));
                setVisible(false);
            }
        });
        
        JPanel painelAtual = this;
               
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(465 , 384 , 200 , 25);
        
        
        
        add(botaoVoltar);
        add(botaoCadastrar);
        
        JLabel labelNumero = new JLabel("N?mero" , SwingConstants.LEFT);
        labelNumero.setBounds(675, 107, 80, 25);
        add(labelNumero);
        labelNumero.setPreferredSize(new Dimension(80 , 25));
        labelNumero.setMinimumSize(new Dimension(80 , 25));
        labelNumero.setMaximumSize(new Dimension(80 , 25));
        
        JTextField textFieldNumero = new JTextField();
        textFieldNumero.setBounds(675, 132, 80, 25);
        add(textFieldNumero);
        textFieldNumero.setAlignmentX(Component.LEFT_ALIGNMENT);
        textFieldNumero.setPreferredSize(new Dimension(80 , 25));
        textFieldNumero.setMinimumSize(new Dimension(80 , 25));
        textFieldNumero.setMaximumSize(new Dimension(80 , 25));
        
        JLabel textFieldUf = new JLabel("UF" , SwingConstants.LEFT);
        textFieldUf.setBounds(675, 257, 80, 25);
        add(textFieldUf);
        textFieldUf.setPreferredSize(new Dimension(80 , 25));
        textFieldUf.setMinimumSize(new Dimension(80 , 25));
        textFieldUf.setMaximumSize(new Dimension(80 , 25));
        
        JComboBox comboBoxUf = new JComboBox(estados);
        comboBoxUf.setBounds(675, 282, 50, 25);
        add(comboBoxUf);
        comboBoxUf.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxUf.setPreferredSize(new Dimension(50 , 25));
        comboBoxUf.setMinimumSize(new Dimension(50 , 25));
        comboBoxUf.setMaximumSize(new Dimension(50 , 25));
        
        botaoCadastrar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {                
                String[] camposAChecar = {textFieldRazaoSocial.getText() , textFieldTelefonePri.getText() , textFieldLogradouro.getText() ,
                                   textFieldBairro.getText() , textFieldCidade.getText() , textFieldCep.getText() ,
                                   textFieldNumero.getText()};
                
                if (ValidadorCampos.checarSeHaVazio(camposAChecar))
                    new TelaAvisoGenerica("H? campos obrigat?rios que n?o foram preenchidos.");
                else
                {
                    int opcao = JOptionPane.showConfirmDialog(null , "As informa??es inseridas est?o corretas?" ,
                                                          "Selecione uma op??o" , JOptionPane.YES_NO_OPTION);
                
                    switch (opcao)
                    {
                        case JOptionPane.YES_OPTION:
                            String[] campos = {cnpj , textFieldRazaoSocial.getText() , textFieldTelefonePri.getText() , textFieldTelefoneSec.getText() ,
                                            textFieldEmail.getText() , textFieldLogradouro.getText() , textFieldBairro.getText() ,
                                            textFieldCidade.getText() , (String) comboBoxUf.getSelectedItem() , textFieldCep.getText() ,
                                            textFieldNumero.getText() , textFieldComplemento.getText()};
                            
                            GerenciadorClientes.cadastrarPj(campos , painelPai , painelAtual);
                            break;
                        
                        case JOptionPane.NO_OPTION:
                            new TelaAvisoGenerica("Revise as informa??es antes de continuar.");
                            break;
                    }
                }
            }
        });
    }
}