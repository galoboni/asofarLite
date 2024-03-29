/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.producto;

import com.farmacia.conponentes.Formulario;
import com.farmacia.dao.CRUD;
import com.farmacia.entities1.CategoriaProducto;
import com.farmacia.entities1.ClaseReporte;
import com.farmacia.entities1.Listar_usuario;
import com.farmacia.entities1.MarcaProducto;
import com.farmacia.entities1.MedidaProducto;
import com.farmacia.entities1.PresentacionProducto;
import com.farmacia.entities1.Productos;
import com.farmacia.entities1.TipoProducto;
import com.farmacia.views.precios.Mantenimiento_Precios_Productos;
import com.farmacia.join_entidades.listarJoinProductosCompras;
import com.farmacia.view.principal.Presentaciones_Nuevo;
import com.farmacia.views.categoria.AgregarCategoria;
import com.farmacia.views.compras.AgregarEnvase;
import com.farmacia.views.compras.AgregarMarca;
import com.farmacia.views.compras.AgregarMedida;
import com.farmacia.views.compras.AgregarTipo;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author User
 */
public class modificarProducto extends javax.swing.JDialog {

    CRUD crud = new CRUD();
    listarJoinProductosCompras obj1 = null;
    int x, y;
    ArrayList<TipoProducto> lista = null;
    ArrayList<MedidaProducto> listam = null;
    ArrayList<PresentacionProducto> listapre = null;
    ArrayList<CategoriaProducto> listaca = null;
    ArrayList<MarcaProducto> listama = null;
    String str_tipo = null, str_medidas = null, str_presentacion = null,str_categoria = null, str_marcas = null, strIva = null;
    String error = "", IVA = "";
    Long id_tipo, id_medida, id_presentacion, id_marca,id_categoria;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    Listar_usuario obj_usu;
    
    public modificarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public modificarProducto(java.awt.Frame parent, boolean modal, listarJoinProductosCompras obj2,Listar_usuario obj) {
       
        super(parent, modal);
         try{
        initComponents();
        obj1 = obj2;
        obj_usu=obj;
        setLocationRelativeTo(null);
        listarCombos(obj1);
        llenarFormulario(obj1);
        Habilitar(false);
        }catch(Exception ex){
        Logger.getLogger(modificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarCombos(listarJoinProductosCompras obj) {
        
        lista = crud.listarTodoTipoProductos1();
        listam = crud.listarTodoMedidasProductos();
        listapre = crud.listarTodoPresentacionProductos();
        listama = crud.listarTodoMarcaProductos();
        listaca = crud.listarTodoCategoriaProductos();
        
        cbxCategoria.setModel(Formulario.listarComboCategoriaPro(listaca));
        cbxTipos1.setModel(Formulario.listarComboTipoPro(lista));
        cbxMedida1.setModel(Formulario.listarComboMedidaPro(listam));
        cbxPresentacion1.setModel(Formulario.listarComboPresentacionPro(listapre));
        cbxMarca1.setModel(Formulario.listarComboMarcaPro(listama));

        str_tipo = crud.getNombreComboProducto(Long.valueOf("1"), obj.getId_tipo());
        cbxTipos1.setSelectedItem(str_tipo);
        str_medidas = crud.getNombreComboProducto(Long.valueOf("2"), obj.getId_medida());
        cbxMedida1.setSelectedItem(str_medidas);
        
        str_presentacion = crud.getNombreComboProducto(Long.valueOf("3"), obj.getId_Presentacion());
        cbxPresentacion1.setSelectedItem(str_presentacion);
        str_categoria = crud.getNombreComboProducto(Long.valueOf("9"), obj.getId_categoria());
        cbxCategoria.setSelectedItem(str_categoria);
        
        str_marcas = crud.getNombreComboProducto(Long.valueOf("4"), obj.getId_marca());
        cbxMarca1.setSelectedItem(str_marcas);
        id_usuario.setText(obj.getId_usuario().toString());
        strIva = crud.getNombreComboProducto(Long.valueOf("5"), obj.getId_productos());
        cbxIva.setSelectedItem(strIva);
        cbxReceta.setSelectedItem(obj.getReceta());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        id_usuario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxMarca1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbxMedida1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtDescripcion1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbxTipos1 = new javax.swing.JComboBox<>();
        btnAgregarTipo1 = new javax.swing.JButton();
        btnAgregarMedida1 = new javax.swing.JButton();
        btnAgreMarca1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtPeso1 = new javax.swing.JTextField();
        btnAgreEnvase1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbxPresentacion1 = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtcantMinima = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbxIva = new javax.swing.JComboBox<>();
        editarPrecio = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        cbxReceta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        codigo2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnAgregarCategoria = new javax.swing.JButton();
        txtFechaActual1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/guardar.jpg"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 153, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PRODUCTO");
        jLabel23.setOpaque(true);
        jLabel23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel23MouseDragged(evt);
            }
        });
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });

        id_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usuarioActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PRODUCTO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("MARCA/LABORATORIO:");

        cbxMarca1.setEditable(true);
        cbxMarca1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarca1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("UNIDAD DE MEDIDA:");

        cbxMedida1.setEditable(true);
        cbxMedida1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxMedida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedida1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("DESCRIPCION:");

        txtDescripcion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcion1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcion1FocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("TIPO:");

        cbxTipos1.setEditable(true);
        cbxTipos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxTipos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTipos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipos1ActionPerformed(evt);
            }
        });

        btnAgregarTipo1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregarTipo1.setText("AGREGAR");
        btnAgregarTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipo1ActionPerformed(evt);
            }
        });

        btnAgregarMedida1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregarMedida1.setText("AGREGAR");
        btnAgregarMedida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedida1ActionPerformed(evt);
            }
        });

        btnAgreMarca1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgreMarca1.setText("AGREGAR");
        btnAgreMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreMarca1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("PESO:");

        txtPeso1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPeso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeso1ActionPerformed(evt);
            }
        });

        btnAgreEnvase1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgreEnvase1.setText("AGREGAR");
        btnAgreEnvase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreEnvase1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("PRESENTACION:");

        cbxPresentacion1.setEditable(true);
        cbxPresentacion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPresentacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPresentacion1ActionPerformed(evt);
            }
        });

        codigo.setEditable(false);
        codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("CODIGO:");

        producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        producto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productoFocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("CANT. MINIMA STOCK:");

        txtcantMinima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcantMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantMinimaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("IVA:");

        cbxIva.setEditable(true);
        cbxIva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cbxIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIvaActionPerformed(evt);
            }
        });

        editarPrecio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editarPrecio.setText("EDITAR PRECIOS");
        editarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPrecioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("UNIDADES:");

        txtUnidades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUnidades.setText("0");
        txtUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesActionPerformed(evt);
            }
        });
        txtUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnidadesKeyReleased(evt);
            }
        });

        cbxReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN RECETA ", "CON RECETA" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CODIGO DE BARRAS:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        codigo2.setEditable(false);
        codigo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("CATEGORIA:");

        cbxCategoria.setEditable(true);
        cbxCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        btnAgregarCategoria.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAgregarCategoria.setText("AGREGAR");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(58, 58, 58)
                        .addComponent(cbxPresentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgreEnvase1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(87, 87, 87)
                                .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(137, 137, 137)
                                .addComponent(cbxTipos1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarTipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgreMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxIva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxReceta, 0, 143, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbxMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTipos1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxPresentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgreEnvase1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgreMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        txtFechaActual1.setEditable(false);
        txtFechaActual1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaActual1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("FECHA:");

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/folder_delete_256_icon-icons.com_75999 (1).png"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/eliminar1.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/folder_add_icon-icons.com_74436.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("USUARIO:");

        Reporte.setBackground(new java.awt.Color(254, 254, 254));
        Reporte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reporte.setText("IMPRIMIR");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(txtFechaActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarFormulario(listarJoinProductosCompras obj) {
        codigo.setText(obj.getId_productos().toString());
        if(obj.getCodigo_barras()==null){
        codigo2.setText("0000000000000");
        }else{codigo2.setText(obj.getCodigo_barras());
        }
        producto.setText(obj.getNombreProductos());
        txtDescripcion1.setText(obj.getDescripcion());
        txtPeso1.setText(obj.getPeso().toString());
        txtFechaActual1.setText(obj.getFecha_registro().toString());
        txtUnidades.setText(obj.getUnidades().toString());
        txtcantMinima.setText(obj.getCantidad_minima().toString());
        System.out.println(//"id_medida: "+obj.getId_medida()+"/n"+
                "id_tipo:" + id_tipo);
//                            "id_envase"+obj.getNombreEnvase()+"/n"+
//                            "id_marca"+obj.getId_marca());
//        
    }


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //        String valor="";
        //        if (!"".equals(seleccionId())) {
        //            JOptionPane.showMessageDialog(this, error);
        //
        //        } else {
        //
        //            Productos p = new Productos();
        //            p.setNombre(nombre1.getText());
        //            p.setDescripcion(txtDescripcion.getText());
        //            p.setFecha_registro(Fecha.FechaSql());
        //            p.setPeso(Double.parseDouble(txtPeso.getText()));
        //            p.setId_tipo(id_tipo);
        //            p.setId_medidas(id_medida);
        //            p.setId_envase(id_envase);
        //            p.setId_marcas(id_marca);
        //            valor = crud.insertarProductoNuevo(p);
        //            JOptionPane.showMessageDialog(this, valor);
        //            System.out.println("holaaaa " + nombre1.getText());
        //            System.out.println(id_tipo + " " + id_medida + " " + id_envase + " " + id_marca + " " + " " + p.getNombre() + " " + p.getDescripcion() + " " + p.getFecha_registro() + " " + p.getPeso() + " " + p.getId_tipo());
        //                 //
        //                //            }
        //            setVisible(false);
        //        }      //            if(valor!=null){
        //                //
        //                //            }
        //            setVisible(false);
        //        }
        Habilitar(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void jLabel23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseDragged

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        x = evt.getX();
        y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MousePressed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String valor = "";
        int h = Confirmacion("Deseas Eliminar el Producto: " + producto.getText() + " con ID: " + codigo.getText() + " ?");
        if (h == 0) {
            valor = crud.eliminarProducto(Long.valueOf(codigo.getText()));
            JOptionPane.showMessageDialog(this, valor);
            this.setVisible(false);
        }
        // listarJoinProductosCompras cp =new listarJoinProductosCompras();

    }//GEN-LAST:event_btneliminarActionPerformed
    public int Confirmacion(String msx) {
        int select = JOptionPane.showConfirmDialog(null, msx, "Confirmar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        System.out.println(select);
        return select;
    }
    private void cbxMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarca1ActionPerformed
        seleccionId();
    }//GEN-LAST:event_cbxMarca1ActionPerformed

    private void cbxMedida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedida1ActionPerformed
        seleccionId();
    }//GEN-LAST:event_cbxMedida1ActionPerformed

    private void txtDescripcion1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcion1FocusLost
        txtDescripcion1.setText(txtDescripcion1.getText().toUpperCase());
    }//GEN-LAST:event_txtDescripcion1FocusLost

    private void cbxTipos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipos1ActionPerformed
        seleccionId();
    }//GEN-LAST:event_cbxTipos1ActionPerformed

    private void btnAgregarTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipo1ActionPerformed
        AgregarTipo nuevotipo = new AgregarTipo(new javax.swing.JFrame(), true);
        nuevotipo.setVisible(true);
        lista = crud.listarTodoTipoProductos1();
        cbxTipos1.setModel(Formulario.listarComboTipoPro(lista));
    }//GEN-LAST:event_btnAgregarTipo1ActionPerformed

    private void btnAgregarMedida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedida1ActionPerformed
        AgregarMedida agremed = new AgregarMedida(new javax.swing.JFrame(), true);
        agremed.setVisible(true);
//        listam.clear();
//        cbxMedida.removeAll();
//        listam = crud.listarTodoMedidasProductos();//     listarTodoTipoProductos1();
//        cbxMedida.setModel(Formulario.listarComboMedidaPro(listam));
        listarCombos(obj1);
    }//GEN-LAST:event_btnAgregarMedida1ActionPerformed

    private void btnAgreMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreMarca1ActionPerformed
        AgregarMarca agremar = new AgregarMarca(new javax.swing.JFrame(), true);
        agremar.setVisible(true);
        listama = crud.listarTodoMarcaProductos();//     listarTodoTipoProductos1();
        cbxMarca1.setModel(Formulario.listarComboMarcaPro(listama));
    }//GEN-LAST:event_btnAgreMarca1ActionPerformed

    private void txtPeso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeso1ActionPerformed

    private void btnAgreEnvase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreEnvase1ActionPerformed
        Presentaciones_Nuevo tn = new Presentaciones_Nuevo(new javax.swing.JFrame(), true,obj_usu);
        tn.setVisible(true);
        listapre = crud.listarTodoPresentacionProductos();
        cbxPresentacion1.setModel(Formulario.listarComboPresentacionPro(listapre));
    }//GEN-LAST:event_btnAgreEnvase1ActionPerformed

    private void cbxPresentacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPresentacion1ActionPerformed
        seleccionId();
        // System.out.println(" " + listae.get(pos_envase).getId_envase() + " " + listae.get(pos_envase).getNombreEnvase());
    }//GEN-LAST:event_cbxPresentacion1ActionPerformed

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        txtDescripcion1.setText(txtDescripcion1.getText().toUpperCase());
    }//GEN-LAST:event_codigoFocusLost

    private void productoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productoFocusLost
        producto.setText(producto.getText().toUpperCase());
    }//GEN-LAST:event_productoFocusLost

    private void txtcantMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantMinimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantMinimaActionPerformed

    private void cbxIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIvaActionPerformed
        IVA = cbxIva.getSelectedItem().toString();
    }//GEN-LAST:event_cbxIvaActionPerformed

    private void editarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPrecioActionPerformed
        Mantenimiento_Precios_Productos mp = new Mantenimiento_Precios_Productos(new javax.swing.JFrame(), true, Long.valueOf(codigo.getText()), producto.getText());
        mp.setVisible(true);
    }//GEN-LAST:event_editarPrecioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        seleccionId();
        String valor = "";
        //        listarJoinProductosCompras cp =new listarJoinProductosCompras();
        //        cp.setNombreProductos(producto.getText());
        //        cp.setDescripcion(txtDescripcion1.getText());
        //        cp.setPeso(Double.valueOf(txtPeso1.getText()));
        //        System.out.println(id_tipo);
        //        cp.setId_tipo(id_tipo);
        //        cp.setId_medida(id_medida);
        //        cp.setId_envase(id_envase);
        //        cp.setId_marca(id_marca);
        //        cp.setId_productos(Long.valueOf(codigo.getText()));
        Productos p = new Productos();
        p.setNombre(producto.getText());
        p.setDescripcion(txtDescripcion1.getText());
        p.setPeso(Double.valueOf(txtPeso1.getText()));
        p.setId_tipo(id_tipo);
        p.setId_medidas(id_medida);
        p.setId_presentacion(id_presentacion);
        p.setId_categoria(id_categoria);
        p.setId_marcas(id_marca);
        p.setId_productos(Long.valueOf(codigo.getText()));
        p.setId_usuario(Long.valueOf(id_usuario.getText()));
        p.setIva(IVA);
        p.setCantidad_minima(Long.valueOf(txtcantMinima.getText()));
        p.setReceta(String.valueOf(cbxReceta.getSelectedItem()));
        p.setUnidades(Long.valueOf(txtUnidades.getText()));
        valor = crud.modificarProductos(p);
        JOptionPane.showMessageDialog(this, valor);
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        ArrayList producto1 = new ArrayList();        
        ClaseReporte producto2 = new ClaseReporte(id_usuario.getText(),txtFechaActual1.getText(),codigo.getText(),cbxIva.getSelectedItem().toString(),producto.getText(),txtDescripcion1.getText(),txtPeso1.getText(),cbxMedida1.getSelectedItem().toString(),cbxTipos1.getSelectedItem().toString(),cbxPresentacion1.getSelectedItem().toString(),cbxMarca1.getSelectedItem().toString(),txtcantMinima.getText());
        producto1.add(producto2);
        try {
            String dir = System.getProperty("user.dir")+"/Reportes/"+"modificarProducto.jasper";
            JasperReport reporte =  (JasperReport) JRLoader.loadObject(dir);            
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null, new JRBeanCollectionDataSource(producto1));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho/2,alto/2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(modificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteActionPerformed

    private void txtUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesActionPerformed

    private void txtUnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesKeyReleased

    private void txtUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidadesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        CodigoBarras cod=new CodigoBarras(null, rootPaneCheckingEnabled,2,codigo2.getText());
        cod.setVisible(true);
        codigo2.setText(cod.getCodigoBarra());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        AgregarCategoria nuevotipo = new AgregarCategoria(new javax.swing.JFrame(), true);
        nuevotipo.setVisible(true);
        listaca = crud.listarTodoCategoriaProductos();
        cbxCategoria.setModel(Formulario.listarComboCategoriaPro(listaca));
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
      seleccionId();
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    public void Habilitar(boolean valor) {
        codigo.setEnabled(valor);
        producto.setEnabled(valor);
        txtDescripcion1.setEnabled(valor);
        txtPeso1.setEnabled(valor);
        txtFechaActual1.setEnabled(valor);
        cbxTipos1.setEnabled(valor);
        cbxMedida1.setEnabled(valor);
        cbxPresentacion1.setEnabled(valor);
        cbxCategoria.setEnabled(valor);
        cbxMarca1.setEnabled(valor);
        btnGuardar.setEnabled(valor);
        id_usuario.setEnabled(valor);
        txtcantMinima.setEnabled(valor);
        cbxIva.setEnabled(valor);
        btnAgregarTipo1.setEnabled(valor);
        btnAgregarMedida1.setEnabled(valor);
        btnAgreMarca1.setEnabled(valor);
        btnAgreEnvase1.setEnabled(valor);
        editarPrecio.setEnabled(valor);
        txtUnidades.setEnabled(valor);
    }

    private String seleccionId() {
        error = "";

        if (txtDescripcion1.getText().length() < 5) {
            error = error + "\nNombre invalido!";
        }
        if (txtDescripcion1.getText().length() < 5) {
            error = error + "\nDescripcion invalida!";
        }
        if (txtPeso1.getText() == null || "".equals(txtPeso1.getText())) {
            error = error + "\nCantidad invalida!";
        }
        int pos = (cbxTipos1.getSelectedIndex() - 1);
        if (pos < 0) {
            error = error + "\nTipo de producto invalido !";
        } else {
            id_tipo = lista.get(pos).getId_tipo();
            System.err.println(id_tipo);
        }

        pos = (cbxMedida1.getSelectedIndex() - 1);
        if (pos < 0) {
            error = error + "\nMedida invalida !";
        } else {
            id_medida = listam.get(pos).getId_medidas();
            System.err.println(id_medida);
        }

        pos = (cbxMarca1.getSelectedIndex() - 1);
        if (pos < 0) {
            error = error + "\nMarca invalida !";
        } else {
            id_marca = listama.get(pos).getId_Marcas();
            System.err.println(id_marca);
        }

        pos = (cbxPresentacion1.getSelectedIndex() - 1);
        if (pos < 0) {
            error = error + "\nPresentacion invalido !";
        } else {
            id_presentacion = listapre.get(pos).getId_presentaciones();
            System.err.println(id_presentacion);
        }
        
        pos = (cbxCategoria.getSelectedIndex() - 1);
        if (pos < 0) {
            error = error + "\nCategoria invalido !";
        } else {
            id_categoria = listaca.get(pos).getId_categoria();
            System.err.println(id_categoria);
        }
        
        return error;
    }

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
            java.util.logging.Logger.getLogger(modificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                modificarProducto dialog = new modificarProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reporte;
    private javax.swing.JButton btnAgreEnvase1;
    private javax.swing.JButton btnAgreMarca1;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarMedida1;
    private javax.swing.JButton btnAgregarTipo1;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxIva;
    private javax.swing.JComboBox<String> cbxMarca1;
    private javax.swing.JComboBox<String> cbxMedida1;
    private javax.swing.JComboBox<String> cbxPresentacion1;
    private javax.swing.JComboBox<String> cbxReceta;
    private javax.swing.JComboBox<String> cbxTipos1;
    private javax.swing.JTextField codigo;
    public javax.swing.JTextField codigo2;
    private javax.swing.JButton editarPrecio;
    public static javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField producto;
    public static javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtFechaActual1;
    public static javax.swing.JTextField txtPeso1;
    public static javax.swing.JTextField txtUnidades;
    public static javax.swing.JTextField txtcantMinima;
    // End of variables declaration//GEN-END:variables
}
