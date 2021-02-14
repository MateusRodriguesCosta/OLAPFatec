package olap;

import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateus Costa
 */
public class Principal extends javax.swing.JFrame {
    private int identificacao = 0;
    OLAP cluster = new OLAP();
    private double total=0;
    private int dynamicList=0;
    private DefaultListModel modelo = new DefaultListModel();
    private DefaultTableModel modelo1;
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        System.out.println("Tamanho:  "+modelo.size());
        System.out.println("Tamanho:  "+modelo.capacity());
        modelo1 = preLista();
        Tabela.setModel(modelo1);             
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        Tabela.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Comprar = new javax.swing.JButton();
        Quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Carrinho = new javax.swing.JList();
        Total = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        NomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BairroCliente = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        PMarca = new javax.swing.JRadioButton();
        PProduto = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PCliente = new javax.swing.JRadioButton();
        PBairro = new javax.swing.JRadioButton();
        nVendas = new javax.swing.JLabel();
        Faturamento = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cliqueAqui = new javax.swing.JLabel();
        RNome = new javax.swing.JTextField();
        RBairro = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ItensCliente = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema OLAP - Supermercados");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loja", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10), new java.awt.Color(51, 51, 51))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Arroz (Branco)", "Tio João",  new Double(9.99)},
                {"Arroz (Branco)", "Tio Ico",  new Double(12.5)},
                {"Arroz (Integral)", "Prato Fino",  new Double(5.99)},
                {"Feijão (Carioca)", "Yoki",  new Double(3.83)},
                {"Feijão (Carioca)", "Fantastico",  new Double(3.59)},
                {"Feijão (Preto)", "Qualitá",  new Double(3.32)},
                {"Feijão (Preto)", "Caldo Bom",  new Double(6.89)},
                {"Bebida (Refrigerante)", "Antarctica",  new Double(2.99)},
                {"Bebida (Refrigerante)", "CocaCola",  new Double(3.1)},
                {"Bebida (Cerveja)", "Budweiser",  new Double(3.09)},
                {"Frios (Carne Picanha)", "Maturatta",  new Double(18.11)},
                {"Frios (Carne Alcatra)", "Friboi",  new Double(16.5)},
                {"Frios (Presunto)", "Sadia",  new Double(2.64)},
                {"Frios (Queijo Mussarela)", "Sadia",  new Double(5.99)},
                {"Massa (Macarrão Fidelinho)", "Renata",  new Double(3.48)},
                {"Limpeza (Lustra móvel)", "Peroba",  new Double(3.69)},
                {"Limpeza (Lustra móvel)", "Brilhol",  new Double(4.19)},
                {"Limpeza (Sabão em Pó)", "OMO",  new Double(12.58)},
                {"Limpeza (Sabão em Pó)", "Ace",  new Double(5.45)},
                {"Limpeza (Limpador Multi Uso)", "Veja",  new Double(5.99)},
                {"Limpeza (Limpador Multi Uso)", "Ypê",  new Double(3.25)},
                {"Limpeza (Amaciante)", "Comfort",  new Double(7.09)},
                {"Higiene (Papel Higiênico)", "Neve",  new Double(6.56)},
                {"Higiene (Papel Higiênico)", "Scott",  new Double(3.3)},
                {"Higiene (Creme Dental)", "Sorriso",  new Double(3.32)},
                {"Higiene (Creme Dental)", "Colgate",  new Double(2.31)},
                {"Higiene (Creme Dental)", "Closeup",  new Double(2.13)}
            },
            new String [] {
                "Tipo", "Marca", "Valor (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabela);

        Comprar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Comprar.setForeground(new java.awt.Color(51, 51, 51));
        Comprar.setText("Comprar");
        Comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantidade.setText("1");
        Quantidade.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quantidade");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Escolha seus produtos e receba em casa!");

        Sair.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Sair.setForeground(new java.awt.Color(51, 51, 51));
        Sair.setText("Sair");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Comprar)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Comprar)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addComponent(Sair)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10), new java.awt.Color(51, 51, 51))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Carrinho.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Carrinho.setForeground(new java.awt.Color(102, 102, 102));
        Carrinho.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Carrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Carrinho.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(Carrinho);

        Total.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Total.setForeground(new java.awt.Color(51, 51, 51));
        Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total.setText("Total: R$ 00,00");

        Finalizar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Finalizar.setForeground(new java.awt.Color(51, 51, 51));
        Finalizar.setText("Finalizar");
        Finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Limpar.setForeground(new java.awt.Color(51, 51, 51));
        Limpar.setText("Limpar");
        Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        NomeCliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        NomeCliente.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome do cliente:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Bairro do cliente:");

        BairroCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        BairroCliente.setForeground(new java.awt.Color(51, 51, 51));
        BairroCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jardim Claro", "Das Palmeiras", "Santo Antonio", "Vila Alta", "Industrial", "Centro", "Vila Velha", "Parque Central", "Itupiauí", "Porteira Preta" }));
        BairroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BairroCliente, 0, 247, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NomeCliente)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Finalizar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Total)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Finalizar)
                    .addComponent(Limpar))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerência", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10), new java.awt.Color(51, 51, 51))); // NOI18N

        PMarca.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotao.add(PMarca);
        PMarca.setForeground(new java.awt.Color(51, 51, 51));
        PMarca.setSelected(true);
        PMarca.setText("Marca mais procurada");
        PMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMarcaMouseClicked(evt);
            }
        });

        PProduto.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotao.add(PProduto);
        PProduto.setForeground(new java.awt.Color(51, 51, 51));
        PProduto.setText("Produto mais rentavel");
        PProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PProdutoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Pesquisa interna");

        Cadastrar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(51, 51, 51));
        Cadastrar.setText("Cadastrar Itens");
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Resultado.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Resultado.setForeground(new java.awt.Color(51, 51, 51));
        Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resultado.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Resultado");

        PCliente.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotao.add(PCliente);
        PCliente.setForeground(new java.awt.Color(51, 51, 51));
        PCliente.setText("Cliente mais rentavel");
        PCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PClienteMouseClicked(evt);
            }
        });

        PBairro.setBackground(new java.awt.Color(255, 255, 255));
        GrupoBotao.add(PBairro);
        PBairro.setForeground(new java.awt.Color(51, 51, 51));
        PBairro.setText("Bairro mais rentavel");
        PBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PBairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBairroMouseClicked(evt);
            }
        });

        nVendas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        nVendas.setForeground(new java.awt.Color(51, 51, 51));
        nVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nVendas.setText("Vendas realizadas: 0");
        nVendas.setToolTipText("");

        Faturamento.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Faturamento.setForeground(new java.awt.Color(51, 51, 51));
        Faturamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Faturamento.setText("Faturamento: R$ 00,00");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(51, 51, 51)));

        cliqueAqui.setBackground(new java.awt.Color(255, 255, 255));
        cliqueAqui.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cliqueAqui.setForeground(new java.awt.Color(51, 51, 51));
        cliqueAqui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cliqueAqui.setText("Pesquisar compras: CLIQUE AQUI");
        cliqueAqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliqueAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliqueAquiMouseClicked(evt);
            }
        });

        RNome.setEditable(false);
        RNome.setBackground(new java.awt.Color(255, 255, 255));
        RNome.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RNome.setForeground(new java.awt.Color(51, 51, 51));
        RNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RNome.setBorder(null);

        RBairro.setEditable(false);
        RBairro.setBackground(new java.awt.Color(255, 255, 255));
        RBairro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RBairro.setForeground(new java.awt.Color(51, 51, 51));
        RBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RBairro.setBorder(null);

        jScrollPane4.setBorder(null);

        ItensCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ItensCliente.setForeground(new java.awt.Color(51, 51, 51));
        ItensCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ItensCliente.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(ItensCliente);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RNome)
            .addComponent(cliqueAqui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
            .addComponent(RBairro, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cliqueAqui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(RBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PBairro)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Resultado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(nVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cadastrar))
                            .addComponent(Faturamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PMarca)
                    .addComponent(PCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PProduto)
                    .addComponent(PBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Faturamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cadastrar)
                    .addComponent(nVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(1);
    }//GEN-LAST:event_SairActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        double valor=0;
        int contador=1;
        try{
        int qnt = Integer.parseInt(Quantidade.getText().toString());        
        this.Carrinho.setModel(modelo);
        dynamicList = dynamicList + qnt;
        modelo.setSize(dynamicList);        
        for(int i = 0; i<=modelo.capacity();i++){            
            if(modelo.get(i) == null && contador<=qnt){                
                modelo.add(i, Tabela.getModel().getValueAt(
                        //Adiciona itens da tabela ao JList (Se posicao do carrinho estiver vazia)
                        Tabela.getSelectedRow(), 0) + " - " +
                        Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 1) + " - " +
                        Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 2)
                        );
                valor = Double.parseDouble(Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 2).toString());
                total = total + valor;
                System.out.println(modelo.get(i));
                contador++;
            }
            if(contador>qnt){
                break;
            }
        }
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, "Quantidade Inválida");
        }
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(df.format(total));
        Total.setText("Total: R$ "+df.format(total));
        Quantidade.setText("1");
    }//GEN-LAST:event_ComprarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        NomeCliente.setText(null);
        Total.setText("Total: R$ 00,00");
        modelo.clear();
    }//GEN-LAST:event_LimparActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        try{
        Compra compra = new Compra(
                identificacao,
                NomeCliente.getText().toString(),
                BairroCliente.getSelectedItem().toString(),
                modelo.getSize()
        );
        for(int i =0;i<=modelo.capacity();i++){
            if(modelo.get(i)!=null){
            System.out.println(modelo.get(i));
                System.out.println("rodando:  "+i);
                String[] temp = modelo.getElementAt(i).toString().split(" - ");
                double value =  Double.parseDouble(temp[2].toString());
                Item item = new Item(temp[0].toString(), temp[1].toString(),value);
                compra.addItem(item);
                System.out.println(item.getMarca());
            }else{
                break;
            }
        }
        cluster.addCluster(identificacao, compra);       
        identificacao++;
        }catch(RuntimeException e){
            //JOptionPane.showMessageDialog(rootPane, "Falha na finalizacao");
        }
        NomeCliente.setText(null);
        modelo.clear();
        total = 0;
        Total.setText("Total: R$ 00,00");
        nVendas.setText("Vendas realizadas: "+identificacao);
        Faturamento.setText("Faturamento: R$"+cluster.Faturamento());
        this.PMarcaMouseClicked(null);
        this.PMarca.setSelected(true);
    }//GEN-LAST:event_FinalizarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        String tipo = null;
        try{
            while(tipo == null){
                tipo =  JOptionPane.showInputDialog(rootPane,"Tipo de produto - Ex.: Feijao (Branco) ");
            }
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, "Entrada inválida");
        }
        String marca = null;
        try{
            while(marca == null){
                 marca = JOptionPane.showInputDialog(null,"Marca do produto");        
            }
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, "Entrada inválida");
        }
        String valor = null;
        try{
            while(valor == null){            
                valor = JOptionPane.showInputDialog(null,"Valor do produto (R$)");            
            }
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(rootPane, "Entrada inválida");
        }
        modelo1.setRowCount(modelo1.getRowCount()+1);
        for(int i=0;i<=Tabela.getRowCount();i++){
            if(modelo1.getValueAt(i,0)==null){    
                modelo1.setValueAt(tipo, i, 0);
                modelo1.setValueAt(marca, i, 1);
                modelo1.setValueAt(valor, i, 2);
             break;
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void PMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMarcaMouseClicked
        this.Resultado.setText(cluster.PMarca());
    }//GEN-LAST:event_PMarcaMouseClicked

    private void PProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PProdutoMouseClicked
        this.Resultado.setText(cluster.PProduto());
    }//GEN-LAST:event_PProdutoMouseClicked

    private void PClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PClienteMouseClicked
        this.Resultado.setText(cluster.PCliente());
    }//GEN-LAST:event_PClienteMouseClicked

    private void PBairroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBairroMouseClicked
        this.Resultado.setText(cluster.PBairro());
    }//GEN-LAST:event_PBairroMouseClicked

    private void cliqueAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliqueAquiMouseClicked
        
        DefaultListModel modelo2 = new DefaultListModel();
        ItensCliente.setModel(modelo2);
        String pesquisa = JOptionPane.showInputDialog("Digite nome do cliente:");
        int contador=0;
        int tamanho=0;
        try{
        for(int i = 0; i<cluster.clusterSize(); i++){                                 
           for(int j = 0; j<cluster.getCompra(i).getTamanho(); j++){               
               if(cluster.getCompra(i).getCliente()!=null && cluster.getCompra(i).getCliente().equals(pesquisa)){                   
                   modelo2.add(contador, cluster.getCompra(i).getItem(j).getMarca() + " - " + 
                           cluster.getCompra(i).getItem(j).getTipo() + " -  R$ " + 
                           cluster.getCompra(i).getItem(j).getValor());
                   contador++;
                   RNome.setText("Nome: "+pesquisa);
                   RBairro.setText("Bairro: "+cluster.getCompra(i).getBairro());
               }           
           }
           
        }
        }catch(RuntimeException e){System.out.println("Array error");}
    }//GEN-LAST:event_cliqueAquiMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BairroCliente;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JList Carrinho;
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel Faturamento;
    private javax.swing.JButton Finalizar;
    private javax.swing.ButtonGroup GrupoBotao;
    private javax.swing.JList ItensCliente;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JRadioButton PBairro;
    private javax.swing.JRadioButton PCliente;
    private javax.swing.JRadioButton PMarca;
    private javax.swing.JRadioButton PProduto;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTextField RBairro;
    private javax.swing.JTextField RNome;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton Sair;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel cliqueAqui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nVendas;
    // End of variables declaration//GEN-END:variables
    public DefaultTableModel preLista(){
        DefaultTableModel modelo1 = new DefaultTableModel(
        new Object [][] {
        {"Arroz (Branco)", "Tio João", 9.99},
        {"Arroz (Branco)", "Tio Ico", 12.5},
        {"Arroz (Integral)", "Prato Fino", 5.99},
        {"Feijão (Carioca)", "Yoki", 3.83},
        {"Feijão (Carioca)", "Fantastico", 3.59},
        {"Feijão (Preto)", "Qualitá", 3.32},
        {"Feijão (Preto)", "Caldo Bom", 6.89},
        {"Bebida (Refrigerante)", "Antarctica", 2.99},
        {"Bebida (Refrigerante)", "CocaCola", 3.1},
        {"Bebida (Cerveja)", "Budweiser", 3.09},
        {"Frios (Carne Picanha)", "Maturatta", 18.11},
        {"Frios (Carne Alcatra)", "Friboi", 16.5},
        {"Frios (Presunto)", "Sadia", 2.64},
        {"Frios (Queijo Mussarela)", "Sadia", 5.99},
        {"Massa (Macarrão Fidelinho)", "Renata", 3.48},
        {"Limpeza (Lustra móvel)", "Peroba", 3.69},
        {"Limpeza (Lustra móvel)", "Brilhol", 4.19},
        {"Limpeza (Sabão em Pó)", "OMO",  12.58},
        {"Limpeza (Sabão em Pó)", "Ace", 5.45},
        {"Limpeza (Limpador Multi Uso)", "Veja", 5.99},
        {"Limpeza (Limpador Multi Uso)", "Ypê", 3.25},
        {"Limpeza (Amaciante)", "Comfort",  7.09},
        {"Higiene (Papel Higiênico)", "Neve",  6.56},
        {"Higiene (Papel Higiênico)", "Scott",  3.3},
        {"Higiene (Creme Dental)", "Sorriso",  3.32},
        {"Higiene (Creme Dental)", "Colgate",  2.31},
        {"Higiene (Creme Dental)", "Closeup",  2.13}
        },
        new String [] {
        "Tipo", "Marca", "Valor (R$)"
        })
            {
                @Override
                public boolean isCellEditable(int row, int col){
                    return false;
                }
            };
        return modelo1;
    }
}