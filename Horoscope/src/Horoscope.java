import java.awt.EventQueue;
//import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Horoscope {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldMonth;
	private JTextField textFieldDate;
	private JTextField textFieldHor;
	private JTextField textFieldAtt;
	String month;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Horoscope window = new Horoscope();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Horoscope() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 222, 173));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(100, 100, 830, 676);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel imglbl = new JLabel("");
		imglbl.setBounds(547, 292, 269, 314);
		frame.getContentPane().add(imglbl);
		
		textFieldName = new JTextField();
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldName.setBackground(new Color(240, 248, 255));
		textFieldName.setBounds(268, 67, 282, 35);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldMonth = new JTextField();
		textFieldMonth.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMonth.setBackground(new Color(240, 248, 255));
		textFieldMonth.setColumns(10);
		textFieldMonth.setBounds(154, 145, 141, 35);
		frame.getContentPane().add(textFieldMonth);
		
		textFieldDate = new JTextField();
		textFieldDate.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDate.setBackground(new Color(240, 248, 255));
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(537, 145, 141, 35);
		frame.getContentPane().add(textFieldDate);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(100, 149, 237));
    	ImageIcon img = new ImageIcon(this.getClass().getResource("/Submit-icon.png"));
    	btnNewButton.setIcon(img);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(response == JOptionPane.YES_OPTION) {
					try {
						String name;
						int date;
						name = textFieldName.getText();
						month = textFieldMonth.getText();
						date = Integer.parseInt(textFieldDate.getText());
						if (month.equalsIgnoreCase("March")) {
				            if (date>=21) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Aries-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Aries.");
				            	textFieldAtt.setText("Eager, Dynamic, Quick and Competitive.");
				                //System.out.println("Horoscope : Aries");
				            }
				            else if (date<=20) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Pisces-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Pisces.");
				            	textFieldAtt.setText("Affectionate, Empathetic, Wise and Artistic.");
				            }
				        }
				        else if (month.equalsIgnoreCase("April")) {
				            if (date<=19) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Aries-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Aries.");
				            	textFieldAtt.setText("Eager, Dynamic, Quick and Competitive.");
				                //System.out.println("Horoscope : Aries");
				            }
				            else if (date>=20) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Taurus-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Taurus.");
				            	textFieldAtt.setText("Strong, Dependable, Sensual and Creative.");
				                //System.out.println("Taurus");
				            }
				        }
				        else if (month.equalsIgnoreCase("May")) {
				            if (date<=20) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Taurus-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Taurus.");
				            	textFieldAtt.setText("Strong, Dependable, Sensual and Creative.");
				                //System.out.println("Taurus");
				            }
				            else if (date>=21) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Gemini-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Gemini.");
				            	textFieldAtt.setText("Versatile, Expressive, Curious and Kind.");
				                //System.out.println("Gemini");
				            }
				        }
				        else if (month.equalsIgnoreCase("June")) {
				            if (date<=20) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Gemini-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Gemini.");
				            	textFieldAtt.setText("Versatile, Expressive, Curious and Kind.");
				                //System.out.println("Gemini");
				            }
				            else if (date>=21) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Cancer-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Cancer.");
				            	textFieldAtt.setText("Intuitive, Sentimental, Compassionate and Protective.");
				                //System.out.println("Cancer");
				            }
				        }
				        else if (month.equalsIgnoreCase("July")) {
				            if (date<=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Cancer-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Cancer.");
				            	textFieldAtt.setText("Intuitive, Sentimental, Compassionate and Protective.");
				                //System.out.println("Cancer");
				            }
				            else if (date>=23) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Leo-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Leo.");
				            	textFieldAtt.setText("Dramatic, Outgoing, Fiery and Self-assured.");
				                //System.out.println("Leo");
				            }
				        }
				        else if (month.equalsIgnoreCase("August")) {
				            if (date<=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Leo-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Leo.");
				            	textFieldAtt.setText("Dramatic, Outgoing, Fiery and Self-assured.");
				                //System.out.println("Leo");
				            }
				            else if (date>=23) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Virgo-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Virgo.");
				            	textFieldAtt.setText("Practical, Loyal, Gentle and Analytical.");
				                //System.out.println("Virgo");
				            }
				        }
				        else if (month.equalsIgnoreCase("September")) {
				            if (date<=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Virgo-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Virgo.");
				            	textFieldAtt.setText("Practical, Loyal, Gentle and Analytical.");
				                //System.out.println("Virgo");
				            }
				            else if (date>=23) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Libra-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Libra.");
				            	textFieldAtt.setText("Social, Fair-minded, Diplomatic and Gracious.");
				                //System.out.println("Libra");
				            }
				        }
				        else if (month.equalsIgnoreCase("October")) {
				            if (date<=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Libra-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Libra.");
				            	textFieldAtt.setText("Social, Fair-minded, Diplomatic and Gracious.");
				                //System.out.println("Libra");
				            }
				            else if (date>=23) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Scorpio-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Scorpio.");
				            	textFieldAtt.setText("Passionate, Stubborn, Resourceful and Brave.");
				                //System.out.println("Scorpio");
				            }
				        }
				        else if (month.equalsIgnoreCase("November")) {
				            if (date<=21) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Scorpio.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Scorpio.");
				            	textFieldAtt.setText("Passionate, Stubborn, Resourceful and Brave.");
				                //System.out.println("Scorpio");
				            }
				            else if (date>=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Sagittarius-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Sagittarius.");
				            	textFieldAtt.setText("Extroverted, Optimistic, Funny and Generous.");
				                //System.out.println("Sagittarius");
				            }
				        }
				        else if (month.equalsIgnoreCase("December")) {
				            if (date<=21) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Sagittarius-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Sagittarius.");
				            	textFieldAtt.setText("Extroverted, Optimistic, Funny and Generous.");
				                //System.out.println("Sagittarius");
				            }
				            if (date>=22) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Capricorn-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Capricorn.");
				            	textFieldAtt.setText("Serious, Independent, Disciplined and Tenacious.");
				                //System.out.println("Capricorn");
				            }
				        }
				        else if (month.equalsIgnoreCase("January")) {
				            if (date<=19) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Capricorn-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Capricorn.");
				            	textFieldAtt.setText("Serious, Independent, Disciplined and Tenacious.");
				                //System.out.println("Capricorn");
				            }
				            else if (date>=20) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Aquarius-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Aquarius.");
				            	textFieldAtt.setText("Deep, Imaginative, Original and Uncompromising.");
				                //System.out.println("Aquarius");
				            }
				        }
				        else if (month.equalsIgnoreCase("February")) {
				            if (date<=18) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Aquarius-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Aquarius.");
				            	textFieldAtt.setText("Deep, Imaginative, Original and Uncompromising.");
				                //System.out.println("Aquarius");
				            }
				            else if (date>=19) {
				            	ImageIcon img = new ImageIcon(this.getClass().getResource("/Pisces-icon.png"));
				            	imglbl.setIcon(img);
				            	textFieldHor.setText("Hey " + name + ". Your horoscope is Pisces.");
				            	textFieldAtt.setText("Affectionate, Empathetic, Wise and Artistic.");
				                //System.out.println("Pisces");
				            }
				        }
					} catch(Exception ex) {
						ex.getStackTrace();
						System.out.println("Error input!");
						JOptionPane.showMessageDialog(null, "There is something wrong, please check!");
					}
				}
				else if (response == JOptionPane.NO_OPTION) {
					;
				}
				
			}
		});
		btnNewButton.setBounds(356, 253, 116, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name -");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(191, 71, 67, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Birth Month - ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(38, 148, 116, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Birth Date -");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(447, 148, 103, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textFieldHor = new JTextField();
		textFieldHor.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHor.setBackground(new Color(240, 248, 255));
		textFieldHor.setBounds(126, 356, 331, 59);
		frame.getContentPane().add(textFieldHor);
		textFieldHor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Horoscope -");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(25, 366, 106, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Traits - ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(27, 458, 89, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textFieldAtt =  new JTextField();
		textFieldAtt.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAtt.setBackground(new Color(240, 248, 255));
		textFieldAtt.setBounds(126, 436, 331, 76);
		frame.getContentPane().add(textFieldAtt);
		textFieldAtt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sign -");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(487, 366, 70, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Horoscope Detector");
		lblNewLabel_5.setForeground(new Color(147, 112, 219));
		lblNewLabel_5.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		lblNewLabel_5.setBounds(281, 10, 251, 35);
		frame.getContentPane().add(lblNewLabel_5);
		/*ImageIcon img = new ImageIcon(this.getClass().getResource("/Aries-icon.png"));
		lblNewLabel_4.setIcon(img);*/
		
	}
}
