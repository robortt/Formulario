package presentacion;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPasswordField;


import javax.swing.JButton;
import javax.swing.JComboBox;

public class UsuarioForm extends JPanel {
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JTextField textApellido;
	private JLabel lblContrasenia;
	private JPasswordField textContrasenia;
	private JLabel lblEmail;
	private JTextField textEmail;
	private JLabel lblCdula;
	private JLabel lblProfesin;
	private JLabel lblInstituto;
	private JTextField txtCedula;
	private JTextField txtProfesion;
	private JTextField textInstituto;
	private JButton btnGuardado;
	private JLabel lblTipoDeUsuario;
	private JComboBox<String> boxTipoUsuario;

	/**
	 * Create the panel.
	 */
	public UsuarioForm() {
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("29px"),
				ColumnSpec.decode("84px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("106px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		add(lblTipoDeUsuario, "2, 2, right, default");
		
		boxTipoUsuario = new JComboBox<String>();
		boxTipoUsuario.addItem("Comun");
		boxTipoUsuario.addItem("Administrador");
		boxTipoUsuario.addItem("Experto");
		add(boxTipoUsuario, "4, 2, left, default");
		
		JLabel lblUsuario = new JLabel("Usuario:");
		add(lblUsuario, "2, 4, right, center");
		
		txtUsuario = new JTextField();
		add(txtUsuario, "4, 4, left, top");
		txtUsuario.setColumns(10);
		
		lblContrasenia = new JLabel("Contrase\u00F1a:");
		add(lblContrasenia, "2, 6, right, default");
		
		textContrasenia = new JPasswordField();
		textContrasenia.setColumns(10);
		add(textContrasenia, "4, 6, left, default");
		
		JLabel lblNombre = new JLabel("Nombre:");
		add(lblNombre, "2, 8, right, default");
		
		txtNombre = new JTextField();
		add(txtNombre, "4, 8, left, default");
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		add(lblApellido, "2, 10, right, default");
		
		textApellido = new JTextField();
		add(textApellido, "4, 10, left, default");
		textApellido.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		add(lblEmail, "2, 12, right, default");
		
		textEmail = new JTextField();
		add(textEmail, "4, 12, left, default");
		textEmail.setColumns(10);
		
		lblCdula = new JLabel("C\u00E9dula:");
		add(lblCdula, "2, 14, right, default");
		
		txtCedula = new JTextField();
		txtCedula.setEnabled(false);
		add(txtCedula, "4, 14, left, default");
		txtCedula.setColumns(10);
		
		lblProfesin = new JLabel("Profesi\u00F3n:");
		add(lblProfesin, "2, 16, right, default");
		
		txtProfesion = new JTextField();
		txtProfesion.setEnabled(false);
		add(txtProfesion, "4, 16, left, default");
		txtProfesion.setColumns(10);
		
		lblInstituto = new JLabel("Instituto:");
		add(lblInstituto, "2, 18, right, default");
		
		textInstituto = new JTextField();
		textInstituto.setEnabled(false);
		add(textInstituto, "4, 18, left, default");
		textInstituto.setColumns(10);
		
		btnGuardado = new JButton("Guardado");
		add(btnGuardado, "4, 20");

	}
}
