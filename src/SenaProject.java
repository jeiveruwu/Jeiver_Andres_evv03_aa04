import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SenaProject {
    public static void main(String[] args) {

        // Crear el marco de la aplicación
        JFrame frame = new JFrame("Formulario Sencillo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear y configurar una etiqueta
        JLabel label = new JLabel("Ingrese su nombre:");
        label.setBounds(50, 50, 200, 30);
        frame.add(label);

        // Crear y configurar un campo de texto
        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);
        frame.add(textField);

        // Crear y configurar un botón
        JButton button = new JButton("Enviar");
        button.setBounds(50, 150, 100, 30);
        frame.add(button);

        // Agregar un evento al botón
        button.addActionListener(e -> {
            String nombre = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hola, " + nombre);
        });

        // Hacer visible el marco
        frame.setVisible(true);


    }
}