import java.awt.*;
import javax.swing.*;
//Code for Faculty
class Faculty {
    public static void main(String args[]) {
        Frame win = new Frame("Faculty Management");

        Label facultyLabel = new Label("Faculty:");
        Label departmentsLabel = new Label("Departments:");
        Label remarksLabel = new Label("Remarks:");
        Label recordsLabel = new Label("Records:");

        Button add = new Button("Add");
        Button update = new Button("Update");
        Button delete = new Button("Delete");
        Button select = new Button("Select");
        Button back = new Button("Back");

        JComboBox<String> facultyComboBox = new JComboBox<>();
        facultyComboBox.addItem("Faculty A");
        facultyComboBox.addItem("Faculty B");
        facultyComboBox.addItem("Faculty C");

        JComboBox<String> departmentsComboBox = new JComboBox<>();
        departmentsComboBox.addItem("Department 1");
        departmentsComboBox.addItem("Department 2");
        departmentsComboBox.addItem("Department 3");

        TextArea remarksArea = new TextArea("Remarks");

        DefaultListModel<String> recordsListModel = new DefaultListModel<>();
        recordsListModel.addElement("Record 1");
        recordsListModel.addElement("Record 2");
        recordsListModel.addElement("Record 3");
        JList<String> recordsList = new JList<>(recordsListModel);
        JScrollPane recordsScrollPane = new JScrollPane(recordsList);

        
        facultyLabel.setBounds(20, 40, 60, 20);
        facultyComboBox.setBounds(100, 40, 120, 20);

        departmentsLabel.setBounds(20, 80, 90, 20);
        departmentsComboBox.setBounds(120, 80, 120, 20);

        add.setBounds(20, 120, 60, 30);
        update.setBounds(90, 120, 60, 30);
        delete.setBounds(160, 120, 60, 30);
        select.setBounds(230, 120, 60, 30);
        back.setBounds(300, 120, 60, 30);

        remarksLabel.setBounds(20, 170, 60, 20);
        remarksArea.setBounds(20, 200, 340, 150);

        recordsLabel.setBounds(400, 40, 60, 20);
        recordsScrollPane.setBounds(400, 70, 200, 280);

        
        win.add(facultyLabel);
        win.add(facultyComboBox);
        win.add(departmentsLabel);
        win.add(departmentsComboBox);
        win.add(add);
        win.add(update);
        win.add(delete);
        win.add(select);
        win.add(back);
        win.add(remarksLabel);
        win.add(remarksArea);
        win.add(recordsLabel);
        win.add(recordsScrollPane);

        win.setLayout(null); 
        win.setSize(630, 400); 
        win.setVisible(true);
    }
}
