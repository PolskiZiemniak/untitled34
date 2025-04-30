import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pilot {
    private JPanel main;
    private JButton onOffButton;
    private JButton volumeUpButton;
    private JButton channelUpButton;
    private JButton VolumeDownButton;
    private JButton channelDownButton;
    private JButton brightnessUpButton;
    private JButton brightnessDownButton;
    private JButton channel1Button;
    private JButton channel4Button;
    private JButton channel2Button;
    private JButton channel3Button;
    private JButton channel7Button;
    private JButton channel5Button;
    private JButton channel6Button;
    private JButton channel8Button;
    private JButton channel9Button;
    private JButton channel0Button;
    private final JButton[] buttons = {channel0Button, channel1Button, channel2Button, channel3Button, channel4Button, channel5Button, channel6Button, channel7Button, channel8Button, channel9Button};
    private int buttonIndex = 0;
    private String channelInput = "";
    private JButton changeChannelButton;
    private JLabel onStatus;
    private JLabel currentVolume;
    private JLabel curentChannel;
    private JLabel currentBrightness;
    Tv tv = new Tv("Telewizor", "750", "LG", 50, 25, 10, 2, 100, 75, 15, "1920x1080");

    public Pilot() {
        onOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.wlaczWylacz();
            }
        });

        volumeUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.podglos();
            }
        });
        VolumeDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.przycisz();
            }
        });

        channelUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.zwiekszKanal();
            }
        });
        channelDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.zmniejszKanal();
            }
        });
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    channelInput += buttonIndex;
                }
            });
            buttonIndex++;
        }


        changeChannelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        brightnessUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.przyciemnij();
            }
        });
        brightnessDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tv.rozjasnij();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pilot");
        frame.setContentPane(new Pilot().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(335, 420);
        frame.setLocationRelativeTo(null);
    }

    public void updateInfo(){

    }

}
