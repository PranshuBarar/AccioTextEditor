import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file,edit;
    JMenuItem newFile, openFile, saveFile;
    JMenuItem cut, copy, paste, selectAll, close;
    JTextArea textArea;

    TextEditor(){
        //Initialize this frame
        frame = new JFrame();

        //Initialize Menu
        menuBar = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");

        menuBar.add(file);
        menuBar.add(edit);

        //Initializing Text Area
        textArea = new JTextArea();

        //Initialize Menu Items related to File Menu
        newFile = new JMenuItem("New File");
        openFile = new JMenuItem("Open File");
        saveFile = new JMenuItem("Save File");

        //Adding all these Menu Items in the File Menu
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        //Now we are adding actionListener to all the three JMenuItems in the File Menu. It means they will listen the
        //actions or in other words if we click on these 3 items they will perform something
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

        //Initialize Menu Items related to the Edit Menu
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        copy = new JMenuItem("Copy");
        selectAll = new JMenuItem("Select All");
        close = new JMenuItem("Close");

        //Adding all these Menu Items in the Edit Menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);

        //Now we are adding actionListener to all the five JMenuItems in the Edit Menu. It means they will listen the
        //actions or in other words if we click on these 5 items they will perform something
        cut.addActionListener(this);
        copy.addActionListener(this);
        selectAll.addActionListener(this);
        paste.addActionListener(this);
        close.addActionListener(this);

        frame.add(textArea);
        frame.setJMenuBar(menuBar);
        frame.setBounds(100, 100, 400, 400);
        frame.setTitle("Text Editor");
        frame.setVisible(true);
    }

    public static void main(String[]args){
        TextEditor textEditor = new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Now will get some actions and perform the actions according to the stimuli
        if(e.getSource() == newFile){

        }
        if(e.getSource() == openFile){

        }
        if(e.getSource() == saveFile) {

        }
        if(e.getSource() == cut){
            textArea.cut();
        }
        if(e.getSource() == copy){
            textArea.copy();
        }
        if(e.getSource() == paste){
            textArea.paste();
        }
        if(e.getSource() == selectAll){
            textArea.selectAll();
        }
        if(e.getSource() == close){
            System.exit(0);
        }

    }
}