package repasoUF2179;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGym extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup grupoDescuento = new ButtonGroup();
	private JComboBox comboAbonos;
	private JLabel lblPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGym frame = new VentanaGym();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaGym() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][51.00][][grow]", "[][][][][][][][15.00][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		contentPane.add(lblNewLabel_1, "cell 2 0,alignx trailing");
		
		JLabel lblNewLabel_7 = new JLabel("Apellidos:");
		contentPane.add(lblNewLabel_7, "cell 3 0,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 4 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI:");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 2 2 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Teléfono");
		contentPane.add(lblNewLabel_3, "cell 2 2,alignx trailing");
		
		JLabel lblNewLabel_9 = new JLabel("Teléfono:");
		contentPane.add(lblNewLabel_9, "cell 3 2,alignx trailing");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 4 2,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo Abono:");
		contentPane.add(lblNewLabel_4, "cell 0 4,alignx trailing");
		
		comboAbonos = new JComboBox();
		comboAbonos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarPrecio();
			}
		});
		comboAbonos.setModel(new DefaultComboBoxModel(new String[] {"Gym Basic!", "Gym Family Plus!", "Gym Extreme Hero!"}));
		contentPane.add(comboAbonos, "cell 1 4 4 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Descuento:");
		contentPane.add(lblNewLabel_5, "cell 0 6");
		
		JRadioButton rdbSin = new JRadioButton("Sin descuento");
		rdbSin.setSelected(true);
		grupoDescuento.add(rdbSin);
		contentPane.add(rdbSin, "cell 1 6");
		
		JRadioButton rdbFamiliar = new JRadioButton("Familiar");
		grupoDescuento.add(rdbFamiliar);
		contentPane.add(rdbFamiliar, "cell 2 6");
		
		JRadioButton rdbJoven = new JRadioButton("Joven");
		grupoDescuento.add(rdbJoven);
		contentPane.add(rdbJoven, "cell 3 6");
		
		JLabel lblNewLabel_6 = new JLabel("Precio:");
		contentPane.add(lblNewLabel_6, "cell 0 8");
		
		lblPrecio = new JLabel("30");
		contentPane.add(lblPrecio, "cell 1 8 2 1");
		
		JLabel lblNewLabel_8 = new JLabel("€");
		contentPane.add(lblNewLabel_8, "cell 4 8");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 9 5 1,grow");
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Aceptar");
		contentPane.add(btnNewButton, "cell 0 10 5 1,alignx center");
	}

	protected void actualizarPrecio() {
		String abono = (String) comboAbonos.getSelectedItem();
		if (abono.equals("Gym Basic!")) {
			lblPrecio.setText(""+30);
		} else if (abono.equals("Gym Family Plus!")) {
			lblPrecio.setText(""+35);
		} else if (abono.equals("Gym Extreme Hero!")) {
			lblPrecio.setText(""+45);
		}
	}

}
