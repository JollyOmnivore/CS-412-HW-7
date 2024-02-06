import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Controller  {
    Model model;
    View view;

    public Controller() {
        model = new Model();
        view = new View();
        AddButtonActionListener addButtonActionListener = new AddButtonActionListener();
        DeleteButtonActionListener deleteButtonActionListener = new DeleteButtonActionListener();
        view.setAddButtonActionListener(addButtonActionListener);
        view.setDeleteButtonActionListener(deleteButtonActionListener);
    }
    class AddButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.addListData(view.getInputText());
        }
    }

    class DeleteButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.removeListData(view.getSelectedListValue());

        }
    }
}








