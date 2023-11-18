/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;
import javax.swing.JTextField;

import logica.Cliente;
import logica.Concesionario;
import logica.Vehiculo;
import logica.Vendedor;
import logica.Venta;

/**
 *
 * @author brara
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrincipal
     */
    private Concesionario concesionario;
    private boolean calculadoOpc1;
    private boolean calculadoOpc2;
    private Vehiculo vehiculoActual;
    private DefaultTableModel modeloTabla;
    
    // lista vehiculos
    private Vehiculo[] dataVehiculo;
    private Vendedor[] dataVendedor;

    public VistaPrincipal() {
        
        vehiculoActual = new Vehiculo();
        concesionario = new Concesionario();
        calculadoOpc1 = false;
        calculadoOpc2 = false;
        
        
        //Inciar Tabla
        Vector columnNames = new Vector();
        columnNames.add("Fecha");
        columnNames.add("ID venta");
        columnNames.add("Vendedor");
        columnNames.add("Dni Cliente");
        columnNames.add("Cliente");
        columnNames.add("Modelo");
        columnNames.add("Usado");
        columnNames.add("Adicionales");
        columnNames.add("V.Cesión");

        this.modeloTabla = new DefaultTableModel(columnNames, 0);
        
        
        // data de prueba
        dataVehiculo = new Vehiculo[10];
        dataVendedor = new Vendedor[2];
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    // Funcion para data de prueba
    private void dataTest() {
        for (int i = 0; i < dataVehiculo.length; i++) {
            dataVehiculo[i] = new Vehiculo();
        }

        for (int i = 0; i < dataVendedor.length; i++) {
            dataVendedor[i] = new Vendedor();
        }

        this.dataVendedor[0].setDni("1234");
        this.dataVendedor[0].setNombre("Bryan");
        this.dataVendedor[0].setDireccion("B");
        this.dataVendedor[0].setTelefono("g");

        this.dataVendedor[1].setDni("0987");
        this.dataVendedor[1].setNombre("BryanB");
        this.dataVendedor[1].setDireccion("B");
        this.dataVendedor[1].setTelefono("g");

        for (Vendedor vn : dataVendedor) {
            concesionario.agregarVendedor(vn);
        }

        this.dataVehiculo[0].setMatricula("AAA-123");
        this.dataVehiculo[1].setMatricula("AAA-234");
        this.dataVehiculo[2].setMatricula("AAA-345");
        this.dataVehiculo[3].setMatricula("AAA-456");
        this.dataVehiculo[4].setMatricula("AAA-567");
        this.dataVehiculo[5].setMatricula("AAA-678");
        this.dataVehiculo[6].setMatricula("AAA-789");
        this.dataVehiculo[7].setMatricula("AAA-890");
        this.dataVehiculo[8].setMatricula("AAA-321");
        this.dataVehiculo[9].setMatricula("AAA-432");
        this.dataVehiculo[0].setMarca("Mazda");
        this.dataVehiculo[1].setMarca("Toyota");
        this.dataVehiculo[2].setMarca("Ford");
        this.dataVehiculo[3].setMarca("Honda");
        this.dataVehiculo[4].setMarca("Honda");
        this.dataVehiculo[5].setMarca("Mazda");
        this.dataVehiculo[6].setMarca("Toyota");
        this.dataVehiculo[7].setMarca("Chevrolet");
        this.dataVehiculo[8].setMarca("Chevrolet");
        this.dataVehiculo[9].setMarca("Mercedez");
        this.dataVehiculo[0].setModelo("2012");
        this.dataVehiculo[1].setModelo("2013");
        this.dataVehiculo[2].setModelo("2014");
        this.dataVehiculo[3].setModelo("2015");
        this.dataVehiculo[4].setModelo("2016");
        this.dataVehiculo[5].setModelo("2017");
        this.dataVehiculo[6].setModelo("2018");
        this.dataVehiculo[7].setModelo("2019");
        this.dataVehiculo[8].setModelo("2011");
        this.dataVehiculo[9].setModelo("2010");
        this.dataVehiculo[0].setCilindrada("260");
        this.dataVehiculo[1].setCilindrada("260");
        this.dataVehiculo[2].setCilindrada("260");
        this.dataVehiculo[3].setCilindrada("260");
        this.dataVehiculo[4].setCilindrada("260");
        this.dataVehiculo[5].setCilindrada("260");
        this.dataVehiculo[6].setCilindrada("260");
        this.dataVehiculo[7].setCilindrada("260");
        this.dataVehiculo[8].setCilindrada("260");
        this.dataVehiculo[9].setCilindrada("260");
        this.dataVehiculo[0].setPrecio(120000000);
        this.dataVehiculo[1].setPrecio(130000000);
        this.dataVehiculo[2].setPrecio(140000000);
        this.dataVehiculo[3].setPrecio(150000000);
        this.dataVehiculo[4].setPrecio(10000000);
        this.dataVehiculo[5].setPrecio(180000000);
        this.dataVehiculo[6].setPrecio(150000000);
        this.dataVehiculo[7].setPrecio(250000000);
        this.dataVehiculo[8].setPrecio(120000000);
        this.dataVehiculo[9].setPrecio(150000000);

        for (Vehiculo vh : dataVehiculo) {
            concesionario.agregarVehiculo(vh);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConcesionaria = new javax.swing.JPanel();
        TabPanelConcesionaria = new javax.swing.JTabbedPane();
        panelAgregar = new javax.swing.JPanel();
        panelAgregarCliente = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        panelAgregarVehiculo = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCilindraje = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnAgregarVehiculo = new javax.swing.JButton();
        txtMatriculaLetras = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCilindraje = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMatriculaNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCantidadVehiculosRegistrados = new javax.swing.JLabel();
        panelAgregarVendedor = new javax.swing.JPanel();
        lblNombre1 = new javax.swing.JLabel();
        lblDni1 = new javax.swing.JLabel();
        lblDireccion1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        txtNombreVendedor = new javax.swing.JTextField();
        txtDniVendedor = new javax.swing.JTextField();
        txtDireccionVendedor = new javax.swing.JTextField();
        txtTelefonoVendedor = new javax.swing.JTextField();
        btnAgregarVendedor = new javax.swing.JButton();
        panelVender = new javax.swing.JPanel();
        panelBuscarVehiculo = new javax.swing.JPanel();
        lblTituloBusvarVehiculo = new javax.swing.JLabel();
        txtLetrasMatricula = new javax.swing.JTextField();
        txtNumerosMatricula = new javax.swing.JTextField();
        btnBuscarMatricula = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelDatosVehiculo = new javax.swing.JPanel();
        btnVenderVehiculo = new javax.swing.JButton();
        panelOpcAdiconalesl1 = new javax.swing.JPanel();
        chckAireAcondicionado = new javax.swing.JCheckBox();
        chckMetalizado = new javax.swing.JCheckBox();
        btnCalcularPrecio = new javax.swing.JButton();
        scrollDatosVehiculo = new javax.swing.JScrollPane();
        panelDatosVehiculoScroll = new javax.swing.JPanel();
        lblDatosMatricula = new javax.swing.JLabel();
        lblDatosMarca = new javax.swing.JLabel();
        lblDatosModelo = new javax.swing.JLabel();
        lblDatosCilindrada = new javax.swing.JLabel();
        lblDatosPrecio = new javax.swing.JLabel();
        btnCederVehiculo = new javax.swing.JButton();
        panelDatosVenta = new javax.swing.JPanel();
        lblDniClienteVenta = new javax.swing.JLabel();
        txtDniClienteVenta = new javax.swing.JTextField();
        panelDatosVendedor = new javax.swing.JPanel();
        lblDniVendedorVenta = new javax.swing.JLabel();
        txtDniVendedorVenta = new javax.swing.JTextField();
        panelCederVehiculo = new javax.swing.JPanel();
        chckCederVehiculo = new javax.swing.JCheckBox();
        panelDatosVehiculoUsado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLetraMatriculaCeder = new javax.swing.JTextField();
        txtNumeroMatriculaCeder = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMarcaCeder = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtModeloCeder = new javax.swing.JTextField();
        txtCilindrajeCeder = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioCeder = new javax.swing.JTextField();
        panelBuscarVenta = new javax.swing.JPanel();
        panelBusquedaVentas1 = new javax.swing.JPanel();
        lblBuscarDniVendedor1 = new javax.swing.JLabel();
        btnBuscarVentasTabla = new javax.swing.JButton();
        txtBuscarVentaClienteTabla = new javax.swing.JTextField();
        panelTableVentas = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAgregarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Nuevo Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblNombre.setText("Nombre:");

        lblDni.setText("DNI:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Telefono:");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarClienteLayout = new javax.swing.GroupLayout(panelAgregarCliente);
        panelAgregarCliente.setLayout(panelAgregarClienteLayout);
        panelAgregarClienteLayout.setHorizontalGroup(
            panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(txtDni)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente)
                .addGap(157, 157, 157))
        );
        panelAgregarClienteLayout.setVerticalGroup(
            panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAgregarVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Nuevo Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblMatricula.setText("Matricula:");

        lblMarca.setText("Marca:");

        lblModelo.setText("Modelo:");

        lblCilindraje.setText("Cilindraje:");

        lblPrecio.setText("Precio:");

        btnAgregarVehiculo.setText("Agregar");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        txtMatriculaLetras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaLetrasKeyTyped(evt);
            }
        });

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        txtCilindraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCilindrajeKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtMatriculaNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaNumeroKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("-");

        javax.swing.GroupLayout panelAgregarVehiculoLayout = new javax.swing.GroupLayout(panelAgregarVehiculo);
        panelAgregarVehiculo.setLayout(panelAgregarVehiculoLayout);
        panelAgregarVehiculoLayout.setHorizontalGroup(
            panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarVehiculoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCilindraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAgregarVehiculoLayout.createSequentialGroup()
                        .addComponent(txtMatriculaLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatriculaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarVehiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarVehiculo)
                .addGap(138, 138, 138))
        );
        panelAgregarVehiculoLayout.setVerticalGroup(
            panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarVehiculoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMatricula)
                    .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMatriculaNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatriculaLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCilindraje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAgregarVehiculo)
                .addContainerGap())
        );

        lblCantidadVehiculosRegistrados.setText("Cantidad de Vehiculos registrados: 0/150");

        panelAgregarVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Nuevo Vendedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblNombre1.setText("Nombre:");

        lblDni1.setText("DNI:");

        lblDireccion1.setText("Dirección:");

        lblTelefono1.setText("Telefono:");

        txtDniVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniVendedorKeyTyped(evt);
            }
        });

        txtTelefonoVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoVendedorKeyTyped(evt);
            }
        });

        btnAgregarVendedor.setText("Agregar");
        btnAgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarVendedorLayout = new javax.swing.GroupLayout(panelAgregarVendedor);
        panelAgregarVendedor.setLayout(panelAgregarVendedorLayout);
        panelAgregarVendedorLayout.setHorizontalGroup(
            panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarVendedorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDni1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(txtDniVendedor)
                    .addComponent(txtDireccionVendedor)
                    .addComponent(txtTelefonoVendedor))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarVendedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarVendedor)
                .addGap(141, 141, 141))
        );
        panelAgregarVendedorLayout.setVerticalGroup(
            panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarVendedorLayout.createSequentialGroup()
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarVendedorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNombre1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarVendedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni1)
                    .addComponent(txtDniVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion1)
                    .addComponent(txtDireccionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono1)
                    .addComponent(txtTelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarVendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(panelAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelAgregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                                .addComponent(panelAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                                .addComponent(lblCantidadVehiculosRegistrados)
                                .addGap(283, 283, 283))))))
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAgregarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidadVehiculosRegistrados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabPanelConcesionaria.addTab("Agregar", panelAgregar);

        panelBuscarVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblTituloBusvarVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloBusvarVehiculo.setText("Ingrese Matricula");

        txtLetrasMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetrasMatriculaKeyTyped(evt);
            }
        });

        txtNumerosMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerosMatriculaKeyTyped(evt);
            }
        });

        btnBuscarMatricula.setText("Buscar");
        btnBuscarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMatriculaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("-");

        javax.swing.GroupLayout panelBuscarVehiculoLayout = new javax.swing.GroupLayout(panelBuscarVehiculo);
        panelBuscarVehiculo.setLayout(panelBuscarVehiculoLayout);
        panelBuscarVehiculoLayout.setHorizontalGroup(
            panelBuscarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloBusvarVehiculo)
                    .addGroup(panelBuscarVehiculoLayout.createSequentialGroup()
                        .addComponent(txtLetrasMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumerosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panelBuscarVehiculoLayout.setVerticalGroup(
            panelBuscarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloBusvarVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLetrasMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumerosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMatricula)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo"));

        btnVenderVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVenderVehiculo.setText("Vender");
        btnVenderVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderVehiculoActionPerformed(evt);
            }
        });

        panelOpcAdiconalesl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        chckAireAcondicionado.setText("Aire Acondicionado");

        chckMetalizado.setText("Metalizado");

        btnCalcularPrecio.setText("Calcular Nuevo Precio");
        btnCalcularPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcAdiconalesl1Layout = new javax.swing.GroupLayout(panelOpcAdiconalesl1);
        panelOpcAdiconalesl1.setLayout(panelOpcAdiconalesl1Layout);
        panelOpcAdiconalesl1Layout.setHorizontalGroup(
            panelOpcAdiconalesl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcAdiconalesl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcAdiconalesl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chckMetalizado)
                    .addComponent(chckAireAcondicionado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcAdiconalesl1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btnCalcularPrecio)
                .addGap(17, 17, 17))
        );
        panelOpcAdiconalesl1Layout.setVerticalGroup(
            panelOpcAdiconalesl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcAdiconalesl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chckAireAcondicionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chckMetalizado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnCalcularPrecio)
                .addContainerGap())
        );

        lblDatosMatricula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosMatricula.setText("Matricula: -");

        lblDatosMarca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosMarca.setText("Marca: -");

        lblDatosModelo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosModelo.setText("Modelo: -");

        lblDatosCilindrada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosCilindrada.setText("CC: -");

        lblDatosPrecio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosPrecio.setText("Precio: -");

        javax.swing.GroupLayout panelDatosVehiculoScrollLayout = new javax.swing.GroupLayout(panelDatosVehiculoScroll);
        panelDatosVehiculoScroll.setLayout(panelDatosVehiculoScrollLayout);
        panelDatosVehiculoScrollLayout.setHorizontalGroup(
            panelDatosVehiculoScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVehiculoScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosVehiculoScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatosMatricula)
                    .addComponent(lblDatosMarca)
                    .addComponent(lblDatosModelo)
                    .addComponent(lblDatosCilindrada)
                    .addComponent(lblDatosPrecio))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        panelDatosVehiculoScrollLayout.setVerticalGroup(
            panelDatosVehiculoScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVehiculoScrollLayout.createSequentialGroup()
                .addComponent(lblDatosMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosCilindrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosPrecio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollDatosVehiculo.setViewportView(panelDatosVehiculoScroll);

        btnCederVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCederVehiculo.setText("Ceder");
        btnCederVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCederVehiculo.setEnabled(false);
        btnCederVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCederVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosVehiculoLayout = new javax.swing.GroupLayout(panelDatosVehiculo);
        panelDatosVehiculo.setLayout(panelDatosVehiculoLayout);
        panelDatosVehiculoLayout.setHorizontalGroup(
            panelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpcAdiconalesl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenderVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCederVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panelDatosVehiculoLayout.setVerticalGroup(
            panelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosVehiculoLayout.createSequentialGroup()
                .addGroup(panelDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosVehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelOpcAdiconalesl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVenderVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCederVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosVehiculoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(scrollDatosVehiculo)))
                .addContainerGap())
        );

        panelDatosVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Venta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblDniClienteVenta.setText("DNI Cliente:");

        txtDniClienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniClienteVentaKeyTyped(evt);
            }
        });

        panelDatosVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Vendedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblDniVendedorVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDniVendedorVenta.setText("DNI Vendedor: ");

        txtDniVendedorVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniVendedorVentaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosVendedorLayout = new javax.swing.GroupLayout(panelDatosVendedor);
        panelDatosVendedor.setLayout(panelDatosVendedorLayout);
        panelDatosVendedorLayout.setHorizontalGroup(
            panelDatosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDniVendedorVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniVendedorVenta)
                .addContainerGap())
        );
        panelDatosVendedorLayout.setVerticalGroup(
            panelDatosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVendedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDatosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDniVendedorVenta)
                    .addComponent(txtDniVendedorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosVentaLayout = new javax.swing.GroupLayout(panelDatosVenta);
        panelDatosVenta.setLayout(panelDatosVentaLayout);
        panelDatosVentaLayout.setHorizontalGroup(
            panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosVentaLayout.createSequentialGroup()
                        .addComponent(lblDniClienteVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelDatosVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosVentaLayout.setVerticalGroup(
            panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVentaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelDatosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDniClienteVenta)
                    .addComponent(txtDniClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatosVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCederVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ceder Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        chckCederVehiculo.setText("Ceder vehiculo usado");
        chckCederVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckCederVehiculoActionPerformed(evt);
            }
        });

        panelDatosVehiculoUsado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Usado"));
        panelDatosVehiculoUsado.setEnabled(false);

        jLabel1.setText("Matricula: ");

        txtLetraMatriculaCeder.setEnabled(false);
        txtLetraMatriculaCeder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetraMatriculaCederKeyTyped(evt);
            }
        });

        txtNumeroMatriculaCeder.setEnabled(false);
        txtNumeroMatriculaCeder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroMatriculaCederKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setText("Marca:");

        txtMarcaCeder.setEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        jLabel6.setText("Modelo:");

        jLabel7.setText("Cilindraje:");

        txtModeloCeder.setEnabled(false);
        txtModeloCeder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloCederKeyTyped(evt);
            }
        });

        txtCilindrajeCeder.setEnabled(false);
        txtCilindrajeCeder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCilindrajeCederKeyTyped(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        jLabel8.setText("Precio:");

        txtPrecioCeder.setEnabled(false);
        txtPrecioCeder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCederKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosVehiculoUsadoLayout = new javax.swing.GroupLayout(panelDatosVehiculoUsado);
        panelDatosVehiculoUsado.setLayout(panelDatosVehiculoUsadoLayout);
        panelDatosVehiculoUsadoLayout.setHorizontalGroup(
            panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                        .addComponent(txtLetraMatriculaCeder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroMatriculaCeder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMarcaCeder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCilindrajeCeder, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(txtModeloCeder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioCeder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        panelDatosVehiculoUsadoLayout.setVerticalGroup(
            panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                                .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(txtModeloCeder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCilindrajeCeder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosVehiculoUsadoLayout.createSequentialGroup()
                                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtLetraMatriculaCeder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNumeroMatriculaCeder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtMarcaCeder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(panelDatosVehiculoUsadoLayout.createSequentialGroup()
                        .addGroup(panelDatosVehiculoUsadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioCeder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelCederVehiculoLayout = new javax.swing.GroupLayout(panelCederVehiculo);
        panelCederVehiculo.setLayout(panelCederVehiculoLayout);
        panelCederVehiculoLayout.setHorizontalGroup(
            panelCederVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCederVehiculoLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(chckCederVehiculo)
                .addGap(505, 505, 505))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCederVehiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatosVehiculoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCederVehiculoLayout.setVerticalGroup(
            panelCederVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCederVehiculoLayout.createSequentialGroup()
                .addComponent(chckCederVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatosVehiculoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVenderLayout = new javax.swing.GroupLayout(panelVender);
        panelVender.setLayout(panelVenderLayout);
        panelVenderLayout.setHorizontalGroup(
            panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVenderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVenderLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(panelCederVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panelVenderLayout.setVerticalGroup(
            panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVenderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatosVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelVenderLayout.createSequentialGroup()
                        .addComponent(panelBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelDatosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCederVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        TabPanelConcesionaria.addTab("Vender", panelVender);

        panelBusquedaVentas1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblBuscarDniVendedor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscarDniVendedor1.setText("DNI Cliente");

        btnBuscarVentasTabla.setText("Buscar");
        btnBuscarVentasTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVentasTablaActionPerformed(evt);
            }
        });

        txtBuscarVentaClienteTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarVentaClienteTablaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaVentas1Layout = new javax.swing.GroupLayout(panelBusquedaVentas1);
        panelBusquedaVentas1.setLayout(panelBusquedaVentas1Layout);
        panelBusquedaVentas1Layout.setHorizontalGroup(
            panelBusquedaVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaVentas1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtBuscarVentaClienteTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBusquedaVentas1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panelBusquedaVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscarDniVendedor1)
                    .addComponent(btnBuscarVentasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelBusquedaVentas1Layout.setVerticalGroup(
            panelBusquedaVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaVentas1Layout.createSequentialGroup()
                .addComponent(lblBuscarDniVendedor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarVentaClienteTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarVentasTabla)
                .addContainerGap())
        );

        panelTableVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas totales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tablaVentas.setModel(this.modeloTabla);
        tablaVentas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        panelTableVentas.setViewportView(tablaVentas);

        javax.swing.GroupLayout panelBuscarVentaLayout = new javax.swing.GroupLayout(panelBuscarVenta);
        panelBuscarVenta.setLayout(panelBuscarVentaLayout);
        panelBuscarVentaLayout.setHorizontalGroup(
            panelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarVentaLayout.createSequentialGroup()
                .addGroup(panelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarVentaLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(panelBusquedaVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTableVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarVentaLayout.setVerticalGroup(
            panelBuscarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusquedaVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabPanelConcesionaria.addTab("Buscar Ventas", panelBuscarVenta);

        javax.swing.GroupLayout panelConcesionariaLayout = new javax.swing.GroupLayout(panelConcesionaria);
        panelConcesionaria.setLayout(panelConcesionariaLayout);
        panelConcesionariaLayout.setHorizontalGroup(
            panelConcesionariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConcesionariaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabPanelConcesionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelConcesionariaLayout.setVerticalGroup(
            panelConcesionariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConcesionariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabPanelConcesionaria)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConcesionaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConcesionaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chckCederVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckCederVehiculoActionPerformed
        boolean estado = chckCederVehiculo.isSelected();

        btnVenderVehiculo.setEnabled(!estado);
        btnCederVehiculo.setEnabled(estado);
        panelDatosVehiculoUsado.setEnabled(estado);
        txtLetraMatriculaCeder.setEnabled(estado);
        txtNumeroMatriculaCeder.setEnabled(estado);
        txtMarcaCeder.setEnabled(estado);
        txtModeloCeder.setEnabled(estado);
        txtPrecioCeder.setEnabled(estado);
        txtCilindrajeCeder.setEnabled(estado);
    }//GEN-LAST:event_chckCederVehiculoActionPerformed

    private void btnCederVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCederVehiculoActionPerformed
        //Verificamos que exista un vehiculo vigente pata vender
        if (vehiculoActual == null) {
            JOptionPane.showMessageDialog(null, "Aun no has buscado un vehiculo", "Vender Vehiculo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDniClienteVenta.getText().equals("") || txtDniVendedorVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Dni de clientes y Vendedor deben llenarse", "Vender Vehiculo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtLetraMatriculaCeder.getText().equals("") || txtNumeroMatriculaCeder.getText().equals("") || txtMarcaCeder.getText().equals("") || txtModeloCeder.getText().equals("") || txtCilindrajeCeder.getText().equals("") || txtPrecioCeder.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos de ceder deben estar llenos", "Vender Vehiculo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Taemos los datos de los campos de DNI de cliente y Vendedor
        String dniCliente = txtDniClienteVenta.getText();
        String dniVendedor = txtDniVendedorVenta.getText();

        //Traemos los datos del vehiculo que se cedera
        String matricula = txtLetraMatriculaCeder.getText() + "-" + txtNumeroMatriculaCeder.getText();
        String marca = txtMarcaCeder.getText();
        String modelo = txtModeloCeder.getText();
        int precio = Integer.parseInt(txtPrecioCeder.getText());
        String cilindraje = txtCilindrajeCeder.getText();

        //Buscamos a el Cliente y al Vendedor para Validar si existen
        Cliente cliente = concesionario.buscarCliente(dniCliente);
        Vendedor vendedor = concesionario.buscarVendedor(dniVendedor);

        //Primero verificamos que el precio
        if (precio <= vehiculoActual.getPrecio()) {
            JOptionPane.showMessageDialog(null, "El precio del vehiculo a ceder no puede ser menor al precio del vehiculo a comprar", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //verificamos que el cliente exista
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no existe", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //verificamos que el vendedor exista
        if (vendedor == null) {
            JOptionPane.showMessageDialog(null, "Vendedor no existe", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Construimos un nuevo vehiculo
        Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, cilindraje, precio);

        if (!concesionario.agregarVehiculo(vehiculo)) {
            JOptionPane.showMessageDialog(null, "Matricula del vehiculo ya existe", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Seteamos que el nuevo vehiculo es un vehiculo usado agregamos el nuevo vehiculo que ha sido cedido
        vehiculo.setUsado(true);
        concesionario.agregarVehiculo(vehiculo);

        //Seteamos que la venta fue por cesion de un vehiculo y creamos la nueva venta
        Venta venta = new Venta(cliente, vehiculoActual, vendedor);
        venta.setCedido(true);

        concesionario.agregarVenta(venta);
        concesionario.eliminarVehiculo(vehiculoActual.getMatricula());

        //mensaje de confirmacion
        JOptionPane.showMessageDialog(null, "Vehiculo Vendido Correctamente", "Vender Nuevo Vehiculo", JOptionPane.INFORMATION_MESSAGE);

        //Limpieamos los campos una vez realizada la venta
        txtDniClienteVenta.setText("");
        txtDniVendedorVenta.setText("");
        txtNumerosMatricula.setText("");
        txtLetrasMatricula.setText("");
        txtLetraMatriculaCeder.setText("");
        txtNumeroMatriculaCeder.setText("");
        txtMarcaCeder.setText("");
        txtModeloCeder.setText("");
        txtCilindrajeCeder.setText("");
        txtPrecioCeder.setText("");
        chckAireAcondicionado.setSelected(false);
        chckMetalizado.setSelected(false);
        
        //limpiamos variables temporales
        calculadoOpc1 = false;
        calculadoOpc2 = false;
        vehiculoActual = null;

        //Limpiamos campos de label una vez la venta ha sido realizada
        this.lblDatosMatricula.setText("Matricula: -");
        this.lblDatosMarca.setText("Marca: -");
        this.lblDatosModelo.setText("Modelo: -");
        this.lblDatosCilindrada.setText("CC: -");
        this.lblDatosPrecio.setText("Precio: -");
    }//GEN-LAST:event_btnCederVehiculoActionPerformed

    private void btnCalcularPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPrecioActionPerformed
        int precio = vehiculoActual.getPrecio(); //se trae el vehiculo que dio resultado en la busqueda y trabajar con el
        if (calculadoOpc1 || calculadoOpc2) {
            JOptionPane.showMessageDialog(null, "Ya agregaste las opcionea adicionales al precio", "Calcular adicionales",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Guardamos el arreglo de opciones
        String[] opc ={"", ""}; 
        //si el check button esta seleccionado, se le aumenta el precio
        if (this.chckAireAcondicionado.isSelected()) {
            vehiculoActual.setPrecio(precio += 500000);
            opc[0] = "Aire Acondicionado";
            calculadoOpc1 = true; // se actualiza la bandera para que no sea calculado mas de una vez
        }

        //Si el check button esta seleccionado, se le aumenta el precio
        if (this.chckMetalizado.isSelected()) {
            vehiculoActual.setPrecio(precio += 800000);
            opc[1] = "Metalizado";
            calculadoOpc2 = true; //Se actualiza la bandera para que no calcule mas de una vez
        }
        
        vehiculoActual.setOpciones(opc);

        this.lblDatosPrecio.setText("Precio: " + concesionario.formatoValor(vehiculoActual.getPrecio()));
    }//GEN-LAST:event_btnCalcularPrecioActionPerformed

    private void btnVenderVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderVehiculoActionPerformed
        //Verificamos que exista un vehiculo vigente pata vender
        if (vehiculoActual == null) {
            JOptionPane.showMessageDialog(null, "Aun no has buscado un vehiculo", "Vender Vehiculo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDniClienteVenta.getText().equals("") || txtDniVendedorVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Dni de clientes y Vendedor deben llenarse", "Vender Vehiculo",
                JOptionPane.ERROR_MESSAGE);
        }
        

        String dniCliente = txtDniClienteVenta.getText();
        String dniVendedor = txtDniVendedorVenta.getText();

        Cliente cliente = concesionario.buscarCliente(dniCliente);
        Vendedor vendedor = concesionario.buscarVendedor(dniVendedor);
        
        //verificamos que el cliente exista
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente no existe", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //verificamos que el vendedor exista
        if (vendedor == null) {
            JOptionPane.showMessageDialog(null, "Vendedor no existe", "Vender Vehiculo", JOptionPane.ERROR_MESSAGE);
            return;
        }
                Venta venta = new Venta(cliente, vehiculoActual, vendedor);

                concesionario.agregarVenta(venta);
                concesionario.eliminarVehiculo(vehiculoActual.getMatricula());
                calculadoOpc1 = false;
                calculadoOpc2 = false;
                vehiculoActual = null;
                JOptionPane.showMessageDialog(null, "Vehiculo Vendido Correctamente", "Vender Nuevo Vehiculo",
                    JOptionPane.INFORMATION_MESSAGE);
                //Limpieamos los campos una vez realizada la venta
                txtDniClienteVenta.setText("");
                txtDniVendedorVenta.setText("");
                txtNumerosMatricula.setText("");
                txtLetrasMatricula.setText("");
                chckAireAcondicionado.setSelected(false);
                chckMetalizado.setSelected(false);
    }//GEN-LAST:event_btnVenderVehiculoActionPerformed

    private void btnBuscarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMatriculaActionPerformed
        // Se Verifica que los campos esten vacios para evitar enviar datos vacios
        if (txtLetrasMatricula.getText().equals("") || txtNumerosMatricula.getText().equals("")) {
            return;
        }

        // Se obtiene los datos del campo y se guardan en una variable para mejor manejo
        String matricula = txtLetrasMatricula.getText() + "-" + txtNumerosMatricula.getText();

        Vehiculo vehiculo = concesionario.buscarVehiculo(matricula);

        if (vehiculo != null) {
            this.lblDatosMatricula.setText("Matricula: " + vehiculo.getMatricula());
            this.lblDatosMarca.setText("Marca: " + vehiculo.getMarca());
            this.lblDatosModelo.setText("Modelo: " + vehiculo.getModelo());
            this.lblDatosCilindrada.setText("CC: " + vehiculo.getCilindrada());
            this.lblDatosPrecio.setText("Precio: " + concesionario.formatoValor(vehiculo.getPrecio()));
            this.vehiculoActual = vehiculo; // se Guarda en una variable global el vehiculo actual para operarlo despues
        } else {
            JOptionPane.showMessageDialog(null, "Matricula no encontrada", "Buscar Matricula",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarMatriculaActionPerformed

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed
        // Condicional para evitar que el codigo se ejecite con los campos vacios
        if (txtMatriculaLetras.getText().equals("") || txtMatriculaNumero.getText().equals("")
            || txtMarca.getText().equals("") || txtModelo.getText().equals("")
            || txtCilindraje.getText().equals("") || txtPrecio.getText().equals("")) {
            dataTest(); // Agregar data de prueba
            return;
        }

        // Se obtienen todos los datos de cada campo y se guardan en variables para
        // mejor manejo
        String matricula = txtMatriculaLetras.getText() + "-" + txtMatriculaNumero.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String cilindraje = txtCilindraje.getText();
        int precio = Integer.parseInt(txtPrecio.getText()); // Se convierte el valor del campo en un integer para operar
        // con el
        // Se construye un objeto de tipo vehiculo para proceder a guardar
        Vehiculo vehiculo = new Vehiculo(matricula, marca, modelo, cilindraje, precio);

        if (concesionario.agregarVehiculo(vehiculo)) { // comparar si el buscador guardo correctamente
            JOptionPane.showMessageDialog(null, "Vehiculo agregado Correctamente", "Agregar Nuevo Vehiculo",
                JOptionPane.INFORMATION_MESSAGE);

            // Se manda un mensaje de confirmacion que ya se ha guardado
            // Se limpian los campos del formulario
            txtMatriculaLetras.setText("");
            txtMatriculaNumero.setText("");
            txtMarca.setText("");
            txtModelo.setText("");
            txtCilindraje.setText("");
            txtPrecio.setText("");
            this.lblCantidadVehiculosRegistrados
            .setText("Cantidad de Vehiculos registrados: " + concesionario.getIndiceVehiculo() + "/150");
        } else {
            // Si ocurrio algun error, se manda un mensaje de error
            JOptionPane.showMessageDialog(null, "Vehiculo ya existe.", "Vehiculo nuevo Cliente.",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // Condicional para evitar que el codigo se ejecite con los campos vacios
        if (txtNombre.getText().equals("") || txtDni.getText().equals("") || txtDireccion.getText().equals("")
            || txtTelefono.getText().equals("")) {
            return;
        }

        // Se obtienen todos los datos de cada campo y se guardan en variables para
        // mejor manejo
        String nombre = txtNombre.getText();
        String dni = txtDni.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();

        // Se construye un objeto de tipo vehiculo para proceder a guardar
        Cliente cliente = new Cliente(nombre, dni, direccion, telefono);

        if (concesionario.agregarCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente agregado Correctamente", "Agregar Nuevo Cliente",
                JOptionPane.INFORMATION_MESSAGE);
            // Se manda un mensaje de confirmacion que ya se ha guardado
            // Se limpian los campos del formulario
            txtNombre.setText("");
            txtDni.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
        } else {
            // Si ocurrio algun error, se manda un mensaje de error
            JOptionPane.showMessageDialog(null, "Cliente ya existe.", "Agregar nuevo Cliente.",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnBuscarVentasTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVentasTablaActionPerformed
        //Verificamos que el campo de busqueda este lleno
            
        if (this.modeloTabla.getRowCount() >= 0) {
            this.modeloTabla.setRowCount(0);
        }
        
        if (txtBuscarVentaClienteTabla.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar el campo", "Buscar Venta",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        

        String dniCliente = txtBuscarVentaClienteTabla.getText();
        String usado = "";
        String cedido = "";
        String opcionesAdicionales = "";
        
        //Buscamos el cliente dentro del registro de ventas
        
        
        List<Venta> ventasEncontradas = concesionario.buscarVentaId(dniCliente);
        
        //Limpiamos las tabla
        modeloTabla.setRowCount(0);
        
        if (ventasEncontradas!=null) {
            
            for(Venta venta : ventasEncontradas){
                if (venta.getCedido()) {
                    cedido = "Si";
                } else {
                    cedido = "No";
                }

                if (venta.getVehiculo().getUsado()) {
                    usado = "Si";
                } else {
                    usado = "No";
                }
                
                for(String opc : venta.getVehiculo().getOpciones()){
                    if(opc!=""){
                        opcionesAdicionales+= " -" + opc;
                    }
                }
                
                modeloTabla.addRow(new Object[]{
                        venta.getFecha(), 
                        venta.getId(), 
                        venta.getVendedor().getNombre(), 
                        venta.getCliente().getDni(), 
                        venta.getCliente().getNombre(),
                        venta.getVehiculo().getModelo(),
                        usado,
                        opcionesAdicionales,
                        cedido
                });
                modeloTabla.fireTableDataChanged();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Buscar Venta",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnBuscarVentasTablaActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtMatriculaNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaNumeroKeyTyped
        soloNumeroLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtMatriculaNumeroKeyTyped

    private void txtMatriculaLetrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaLetrasKeyTyped
        soloTextoLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtMatriculaLetrasKeyTyped

    private void txtCilindrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCilindrajeKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_txtCilindrajeKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtLetrasMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetrasMatriculaKeyTyped
        soloTextoLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtLetrasMatriculaKeyTyped

    private void txtNumerosMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerosMatriculaKeyTyped
        soloNumeroLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtNumerosMatriculaKeyTyped

    private void txtDniClienteVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniClienteVentaKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtDniClienteVentaKeyTyped

    private void txtDniVendedorVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVendedorVentaKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtDniVendedorVentaKeyTyped

    private void txtLetraMatriculaCederKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetraMatriculaCederKeyTyped
        soloTextoLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtLetraMatriculaCederKeyTyped

    private void txtNumeroMatriculaCederKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroMatriculaCederKeyTyped
        soloNumeroLimitarCaracteres(evt, 3);
    }//GEN-LAST:event_txtNumeroMatriculaCederKeyTyped

    private void txtCilindrajeCederKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCilindrajeCederKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_txtCilindrajeCederKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        soloNumeroLimitarCaracteres(evt, 4);
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtModeloCederKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloCederKeyTyped
        soloNumeroLimitarCaracteres(evt, 4);
    }//GEN-LAST:event_txtModeloCederKeyTyped

    private void txtPrecioCederKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCederKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_txtPrecioCederKeyTyped

    private void txtBuscarVentaClienteTablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVentaClienteTablaKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtBuscarVentaClienteTablaKeyTyped

    private void txtDniVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVendedorKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtDniVendedorKeyTyped

    private void txtTelefonoVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoVendedorKeyTyped
        soloNumeroLimitarCaracteres(evt, 10);
    }//GEN-LAST:event_txtTelefonoVendedorKeyTyped

    private void btnAgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVendedorActionPerformed
        // Condicional para evitar que el codigo se ejecite con los campos vacios
        if (txtNombreVendedor.getText().equals("") || txtDniVendedor.getText().equals("") || txtDireccionVendedor.getText().equals("")
            || txtTelefonoVendedor.getText().equals("")) {
            return;
        }

        // Se obtienen todos los datos de cada campo y se guardan en variables para
        // mejor manejo
        String nombre = txtNombreVendedor.getText();
        String dni = txtDniVendedor.getText();
        String direccion = txtDireccionVendedor.getText();
        String telefono = txtTelefonoVendedor.getText();

        // Se construye un objeto de tipo vehiculo para proceder a guardar
        Vendedor Vendedor = new Vendedor(nombre, dni, direccion, telefono);

        if (concesionario.agregarVendedor(Vendedor)) {
            JOptionPane.showMessageDialog(null, "Vendedor agregado Correctamente", "Agregar Nuevo Vendedor",
                JOptionPane.INFORMATION_MESSAGE);
            // Se manda un mensaje de confirmacion que ya se ha guardado
            // Se limpian los campos del formulario
            txtNombreVendedor.setText("");
            txtDniVendedor.setText("");
            txtDireccionVendedor.setText("");
            txtTelefonoVendedor.setText("");
        } else {
            // Si ocurrio algun error, se manda un mensaje de error
            JOptionPane.showMessageDialog(null, "Vendedor ya existe.", "Agregar nuevo Vendedor.",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarVendedorActionPerformed
    
    private void soloNumero(java.awt.event.KeyEvent evt){
        char caracter;
        caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }
    
    private void soloTexto(java.awt.event.KeyEvent evt) {
        char caracter;
        caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {
            evt.consume();
        }
    }
    private void soloTextoLimitarCaracteres(java.awt.event.KeyEvent evt, int numerosCatacteres) {
        char caracter;
        caracter = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        String textoActual = textField.getText();
        
        if (Character.isDigit(caracter)) {
            evt.consume();
        }
        if (textoActual.length() >= numerosCatacteres && textField.getSelectedText() == null) {
            evt.consume(); // Si ya hay 3 caracteres y no se está seleccionando texto para reemplazar, consume el evento
        }
        caracter = Character.toUpperCase(caracter);
        evt.setKeyChar(caracter); // Establecer el carácter convertido

        textField.setText(textoActual.toUpperCase()); // Convertir todo el texto a mayúsculas

        // Mover el cursor al final del texto
        textField.setCaretPosition(textField.getDocument().getLength());
    }
    
    private void soloNumeroLimitarCaracteres(java.awt.event.KeyEvent evt, int numerosCatacteres) {
        char caracter;
        caracter = evt.getKeyChar();
        JTextField textField = (JTextField) evt.getSource();
        String textoActual = textField.getText();
        
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
        if (textoActual.length() >= numerosCatacteres && textField.getSelectedText() == null) {
            evt.consume(); // Si ya hay 3 caracteres y no se está seleccionando texto para reemplazar, consume el evento
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPanelConcesionaria;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnAgregarVendedor;
    private javax.swing.JButton btnBuscarMatricula;
    private javax.swing.JButton btnBuscarVentasTabla;
    private javax.swing.JButton btnCalcularPrecio;
    private javax.swing.JButton btnCederVehiculo;
    private javax.swing.JButton btnVenderVehiculo;
    private javax.swing.JCheckBox chckAireAcondicionado;
    private javax.swing.JCheckBox chckCederVehiculo;
    private javax.swing.JCheckBox chckMetalizado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBuscarDniVendedor1;
    private javax.swing.JLabel lblCantidadVehiculosRegistrados;
    private javax.swing.JLabel lblCilindraje;
    private javax.swing.JLabel lblDatosCilindrada;
    private javax.swing.JLabel lblDatosMarca;
    private javax.swing.JLabel lblDatosMatricula;
    private javax.swing.JLabel lblDatosModelo;
    private javax.swing.JLabel lblDatosPrecio;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDni1;
    private javax.swing.JLabel lblDniClienteVenta;
    private javax.swing.JLabel lblDniVendedorVenta;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblTituloBusvarVehiculo;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelAgregarCliente;
    private javax.swing.JPanel panelAgregarVehiculo;
    private javax.swing.JPanel panelAgregarVendedor;
    private javax.swing.JPanel panelBuscarVehiculo;
    private javax.swing.JPanel panelBuscarVenta;
    private javax.swing.JPanel panelBusquedaVentas1;
    private javax.swing.JPanel panelCederVehiculo;
    private javax.swing.JPanel panelConcesionaria;
    private javax.swing.JPanel panelDatosVehiculo;
    private javax.swing.JPanel panelDatosVehiculoScroll;
    private javax.swing.JPanel panelDatosVehiculoUsado;
    private javax.swing.JPanel panelDatosVendedor;
    private javax.swing.JPanel panelDatosVenta;
    private javax.swing.JPanel panelOpcAdiconalesl1;
    private javax.swing.JScrollPane panelTableVentas;
    private javax.swing.JPanel panelVender;
    private javax.swing.JScrollPane scrollDatosVehiculo;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtBuscarVentaClienteTabla;
    private javax.swing.JTextField txtCilindraje;
    private javax.swing.JTextField txtCilindrajeCeder;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionVendedor;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniClienteVenta;
    private javax.swing.JTextField txtDniVendedor;
    private javax.swing.JTextField txtDniVendedorVenta;
    private javax.swing.JTextField txtLetraMatriculaCeder;
    private javax.swing.JTextField txtLetrasMatricula;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarcaCeder;
    private javax.swing.JTextField txtMatriculaLetras;
    private javax.swing.JTextField txtMatriculaNumero;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModeloCeder;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtNumeroMatriculaCeder;
    private javax.swing.JTextField txtNumerosMatricula;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioCeder;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoVendedor;
    // End of variables declaration//GEN-END:variables
}
