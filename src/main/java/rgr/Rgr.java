package rgr;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Rgr {
	Double total_price = (double) -1000;
	public Rgr(Boolean isAdmin) {
		

		if (isAdmin==true) {
			JOptionPane.showMessageDialog(null, "�� ����� ����� ������ ��������� ������!");
		}
			
		JFrame main_GUI= new JFrame("Cost install work ");
		main_GUI.setTitle("Cost install work");
		main_GUI.setBounds(600, 200,400, 530);
		main_GUI.setResizable(false);
		
		JPanel main_panel =new JPanel();
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JCheckBox sale=new JCheckBox();
		sale.setBounds(230,390,20,30);
		main_panel.add(sale);
		sale.setVisible(false);
		
		if (isAdmin==true) {
			JLabel label11 = new JLabel("��� ���������� ��������:"); // ����������� ������ ��� �����������
			label11.setBounds(120,1,200,30);
			main_panel.add(label11);
			
			main_panel.setBackground(Color.blue);
			
			JLabel labelSale = new JLabel("������"); // ����������� ������ ��� �����������
			labelSale.setBounds(20,390,150,30);
			main_panel.add(labelSale);
							
			sale.setVisible(true);
			
		}
		
		JLabel label1 = new JLabel("��� ���������� ��������:"); // ����������� ������ ��� �����������
		label1.setBounds(20,30,200,30);
		main_panel.add(label1);
		
		JLabel label2 = new JLabel("��� ��������"); // ����������� ������ ��� �����������
		label2.setBounds(20,70,150,30);
		main_panel.add(label2);
		
		JLabel label3 = new JLabel("������� ���������, �^2"); // ����������� ������ ��� �����������
		label3.setBounds(20,110,170,30);
		main_panel.add(label3);
		
		JLabel label4 = new JLabel("�������� ���������, �"); // ����������� ������ ��� �����������
		label4.setBounds(20,150,150,30);
		main_panel.add(label4);
		
		JLabel label5 = new JLabel("���������� ����� � ���������"); // ����������� ������ ��� �����������
		label5.setBounds(20,190,200,30);
		main_panel.add(label5);
		
		JLabel label6 = new JLabel("������ ���"); // ����������� ������ ��� �����������
		label6.setBounds(20,230,150,30);
		main_panel.add(label6);
		
		JLabel label7 = new JLabel("��������� ��������� ��������"); // ����������� ������ ��� �����������
		label7.setBounds(20,270,200,30);
		main_panel.add(label7);
		
		JLabel label8 = new JLabel("��������� ��������� ��������"); // ����������� ������ ��� �����������
		label8.setBounds(20,310,200,30);
		main_panel.add(label8);
		
		JLabel label9 = new JLabel("��������� ���������"); // ����������� ������ ��� �����������
		label9.setBounds(20,350,200,30);
		main_panel.add(label9);
			
			JCheckBox boxfl=new JCheckBox();
			boxfl.setBounds(230,230,20,30);
			main_panel.add(boxfl);
			
			   JTextField squareTextField =new JTextField();
			   squareTextField.setBounds(230, 110, 150, 30);
			   squareTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(squareTextField);
		        
		        JTextField perimeterTextField=new JTextField();
		        perimeterTextField.setBounds(230, 150, 150, 30);
		        perimeterTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(perimeterTextField);
		        
		        JTextField amountAnglesTextField=new JTextField();
		        amountAnglesTextField.setBounds(230, 190, 150, 30);
		        amountAnglesTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(amountAnglesTextField);
		        
		        JTextField field4=new JTextField();
		        field4.setBounds(230, 270, 150, 30);
		        field4.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field4);
		        
		        JTextField field5=new JTextField();
		        field5.setBounds(230, 310, 150, 30);
		        field5.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field5);
		        
		        JTextField field6=new JTextField();
		        field6.setBounds(230, 350, 150, 30);
		        field6.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field6); // ���� ������   
		        
		        
	        JButton button_rachet = new JButton("����������"); // ��������� ������
	        button_rachet.setBounds(280, 425, 100, 35);
	        main_panel.add(button_rachet);
	        ActionListener rachetListener = new ActionListener() {
/* baseprise - ���� �������� cover price - ���� �������� parse - ���������� ������ � ����� gettext - �������� ����� */
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try {
						Double basePrice =Double.parseDouble(field5.getText());
						Double coverPrice =Double.parseDouble(field4.getText());
						Double perimetr= Double.parseDouble(perimeterTextField.getText());
						Double square=Double.parseDouble(squareTextField.getText());
						int count_angles=Integer.parseInt(amountAnglesTextField.getText());
						Double tmp=basePrice+coverPrice;
						if(boxfl.isSelected()) {
							tmp+=490; //���� ������� ��������� ������� ����
							
						}
						Double price_floor=tmp*square;
						Double plintus_price= (count_angles+perimetr)*100;
						total_price =(price_floor+plintus_price);
						if (isAdmin==true) {
							if(sale.isSelected()) {
								total_price=total_price*0.9;
						}}
						if(perimetr==0 || square==0)
	                        total_price=0.0;
						field6.setText(total_price.toString());
					} catch(Exception e) {
						JOptionPane.showMessageDialog(null, "��������� �� ��� ���� ��� �� � ������������ �������");
						
					}
					
				}
	        	
	        	
	        	
	        };
	        
	        button_rachet.addActionListener(rachetListener);
	        
	        
	        JButton button_exit = new JButton("�����"); // ��������� ������
	        button_exit.setBounds(5, 425, 100, 35);
			main_panel.add(button_exit);
			ActionListener exitActionListener=new ListenerButton();
			button_exit.addActionListener(exitActionListener);
			
			JMenuBar menu_bar= new JMenuBar();
	        JButton menu= new JButton("�������");
	        ActionListener infoActionListener=new Info();
	        menu.addActionListener(infoActionListener);
	        
	        JButton button_pdf = new JButton("� PDF"); 
	        button_pdf.setBounds(145, 425, 100, 35);
	        main_panel.add(button_pdf);
	        
	        ActionListener pdfListener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (total_price<0) {
						JOptionPane.showMessageDialog(null, "������!");
					}
					else {
					Document document = new Document();
					try {
						PdfWriter.getInstance(document, new FileOutputStream("rachet.pdf"));
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
						
					} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}

					document.open();
					Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
					
					Chunk chunk2 = new Chunk("Result: ", font);
					Chunk chunk3 = new Chunk(total_price.toString(), font);
					
					try {
						document.add(chunk2);
						document.add(chunk3);
					} catch (DocumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					}
					document.close();
				}
				}
	        };
	       
	        button_pdf.addActionListener(pdfListener);
	        
	        
	        
	        
	        Cover laminateCover =new Cover();
	        Cover parquetCover =new Cover();
	        Cover linoleumCover= new Cover();
	        
	        laminateCover.setName("�������");
	        parquetCover.setName("������");
	        linoleumCover.setName("��������");
	        
	        laminateCover.setPrice("200");
	        parquetCover.setPrice("490");
	        linoleumCover.setPrice("110");
	       
	        
	        
	        String[] box1 = { // ���������� ������� ��� combo box
	        		"",
					laminateCover.getName(),
					parquetCover.getName(),
					linoleumCover.getName()
			    };
	        
	        JComboBox cb1 = new JComboBox(box1); 
	        cb1.setBounds(230,30,150,30);
	        main_panel.add(cb1);
	        
	        
	        ActionListener coverBoxListener=new ActionListener() { 
	        	public void actionPerformed(ActionEvent e) {
	        	String choose= (String)cb1.getSelectedItem();
	        	switch (choose) {
	        	case "": field4.setText(""); break;
	        	case "�������": field4.setText(laminateCover.getPrice()); break;
	        	case "������" : field4.setText(parquetCover.getPrice());  break;
	        	case "��������": field4.setText(linoleumCover.getPrice()); break;
	        	}
	        	
	        	}
	        };
	        cb1.addActionListener(coverBoxListener);
	        
	        Base corkBase =new Base();
	        Base polyurethaneBase =new Base();
	        Base plywood =new Base();
	        Base fiberboard=new Base();
	        
	        corkBase.setName("��������� �����");
	        polyurethaneBase.setName("�������������� ����");
	        plywood.setName("������");
	        fiberboard.setName("���");
	        
	        corkBase.setPrice("210");
	        polyurethaneBase.setPrice("140");
	        plywood.setPrice("400");
	        fiberboard.setPrice("105");
	        
	        
	        
	        String[] box2 = { // ���������� �������
					
					"",
			        corkBase.getName(),  
			        polyurethaneBase.getName(),
			        plywood.getName(),
			        fiberboard.getName()
			    };
	        
	      
	        JComboBox cb2 = new JComboBox(box2);//  ��������� ��� ��������
	        cb2.setBounds(230,70,150,30);
			main_panel.add(cb2);
			  ActionListener baseBoxListener=new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String choose=(String)cb2.getSelectedItem();
						switch (choose) {
						case "": field5.setText("");break;
						case "��������� �����": field5.setText(corkBase.getPrice());break;
						case "�������������� ����" : field5.setText(polyurethaneBase.getPrice());break;
						case "������" : field5.setText(plywood.getPrice());break;
						case "���" : field5.setText(fiberboard.getPrice());break;
							
						
						}
						
					}
		        	
		        	
		        	
		        };
		       cb2.addActionListener(baseBoxListener);	
	        
	     
	    
	        menu_bar.add(menu);
	        main_GUI.setJMenuBar(menu_bar);
			main_GUI.setVisible(true); 
			 
		
	}
	public static void main (String [] args) {
		try {
			Auth auth = new Auth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//Rgr start =new Rgr();
		
		
	}
	
}