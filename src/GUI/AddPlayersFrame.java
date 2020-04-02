package GUI;

import javax.swing.*;
import java.awt.*;

public class AddPlayersFrame extends JFrame{

private JPanel westPnl = new JPanel();
private JPanel westCenter = new JPanel();
private JPanel westNorth = new JPanel();
private JPanel northPnl= new JPanel();
private JPanel southWestPnl = new JPanel();
private JPanel east = new JPanel();
private JPanel northWest = new JPanel();
private JPanel northEastPnl= new JPanel();
private JPanel southEastPnl= new JPanel();

private JTable tblAddedPlayers = new JTable();

private JTextField txtAddPlayerName= new JTextField();

private JLabel lblPlayerName= new JLabel("Player name");
private JLabel lblAddedPlayers = new JLabel("Added players");

private JButton btnAddPlayer= new JButton("Add player");
private JButton btnImportTeam = new JButton("Import teams");
private JButton btnSavePlayer = new JButton("Save player");
private JButton btnPickTeams = new JButton("Pick teams");

JScrollPane scroll = new JScrollPane(tblAddedPlayers, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

public AddPlayersFrame(){
    super("Easy Tournament");
    setSize(1200,850);
    setupWestPnl();
    setupEastPnl();
    setVisible(true);


}
public void setupWestPnl(){
    add(westPnl, new GridLayouft(10,10));
    //add(westPnl, BorderLayout.WEST);
    westPnl.setPreferredSize(new Dimension(600,820));
    southWestPnl.setPreferredSize(new Dimension(500,400));
    //westPnl.add(westNorth, BorderLayout.NORTH);
    westNorth.add(btnAddPlayer);
    westNorth.add(btnImportTeam);
    westNorth.add(btnSavePlayer);
    westNorth.add(txtAddPlayerName);
    westPnl.add(southWestPnl,BorderLayout.SOUTH);

    btnPickTeams.setPreferredSize(new Dimension(100,50));
    southWestPnl.add(btnPickTeams);



}
public void setupEastPnl(){
    add(east, BorderLayout.EAST);
    east.setPreferredSize(new Dimension(600,200));
    east.add(northEastPnl, BorderLayout.NORTH);
    northEastPnl.setPreferredSize(new Dimension(600,50));

    east.add(southEastPnl, BorderLayout.SOUTH);
    lblAddedPlayers.setPreferredSize(new Dimension(100,50));
    northEastPnl.add(lblAddedPlayers);
    scroll.setPreferredSize(new Dimension(300,700));
    tblAddedPlayers.setPreferredScrollableViewportSize(new Dimension(300,600));
    southEastPnl.add(scroll);
}

    public static void main(String[] args) {
        AddPlayersFrame addPlayersFrame= new AddPlayersFrame();
    }

}
