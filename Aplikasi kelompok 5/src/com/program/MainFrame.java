package com.program;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import com.partials.cButton;
import com.partials.cComboBox;
import com.partials.cScrollPane;
import com.partials.cTable;
import com.partials.cTextFields;

public class MainFrame extends JFrame {

    JPanel mainPanel = new JPanel();

    JLabel labelJudul = new JLabel("Masukan Judul");
    JLabel labelNamaPengarang = new JLabel("Masukan Pengarang");
    JLabel labelPenerbit = new JLabel("Masukan Penerbit");
    JLabel labelTahunCetak = new JLabel("Masukan Tahun Cetak");
    JLabel labelKategori = new JLabel("Masukan Kategori");
    cTextFields txtJudul = new cTextFields(300, 70,250, 45, 15);
    cTextFields txtNamaPengarang = new cTextFields(300, 120,250, 45, 15);
    cTextFields txtPenerbit = new cTextFields(300, 170,250, 45, 15);
    cTextFields txtTahunCetak = new cTextFields(300, 220,250, 45, 15);
    cComboBox kategoriBox = new cComboBox(640, 150, 250, 45, 10);

    cButton addButton = new cButton("Tambah", 640,220, 250, 45);

    cTable dataTabel;
    cScrollPane spDataTabel;
    DefaultTableModel dm ;

    List<dataKomponen> dataBarang;


    public MainFrame(){

        super();

        this.dataBarang = new ArrayList<dataKomponen>();

        setTitle("Aplikasi Toko Buku Kel 5");
        setSize(1000, 700);
        setLayout(null);
        setLocationRelativeTo(null);

        mainPanel.setBounds(0, 0, 1000, 700);
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);

        labelJudul.setLayout(null);
        labelJudul.setBounds(50, 70, 250, 45);
        labelJudul.setBackground(Color.WHITE);
        labelJudul.setFont(new Font("Poppins",Font.PLAIN, 20));

        labelNamaPengarang.setLayout(null);
        labelNamaPengarang.setBounds(50, 120, 250, 45);
        labelNamaPengarang.setBackground(Color.WHITE);
        labelNamaPengarang.setFont(new Font("Poppins",Font.PLAIN, 20));

        labelPenerbit.setLayout(null);
        labelPenerbit.setBounds(50, 170, 250, 45);
        labelPenerbit.setBackground(Color.WHITE);
        labelPenerbit.setFont(new Font("Poppins",Font.PLAIN, 20));

        labelTahunCetak.setLayout(null);
        labelTahunCetak.setBounds(50, 220, 250, 45);
        labelTahunCetak.setBackground(Color.WHITE);
        labelTahunCetak.setFont(new Font("Poppins",Font.PLAIN, 20));

        labelKategori.setLayout(null);
        labelKategori.setBounds(680, 100, 250, 45);
        labelKategori.setBackground(Color.WHITE);
        labelKategori.setFont(new Font("Poppins",Font.PLAIN, 20));
        
        kategoriBox.addItem("Semua Umur");
        kategoriBox.addItem("Anak-anak");
        kategoriBox.addItem("Dewasa");
        kategoriBox.addItem("Remaja");


        Object[] header ={"Judul","Nama Pengarang","Penerbit","Tahun Cetak","Kategori"};
        DefaultTableModel dm = new DefaultTableModel(null, header);
        dataTabel = new cTable(dm);
        spDataTabel = new cScrollPane(dataTabel,50,300,880,350);
        
        addButton.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String judul = txtJudul.getText();
                String namaPengarang = txtNamaPengarang.getText();
                String penerbit = txtPenerbit.getText();
                int tahunTerbit = Integer.parseInt(txtTahunCetak.getText());
                String kategori = kategoriBox.getSelectedItem().toString();
                int counter = 0;

                
                // dm.addRow(new Object[]{judul,namaPengarang,penerbit,tahunTerbit,kategori});
                tambahData(judul,namaPengarang,penerbit,tahunTerbit,kategori);
                
                for (int i = 0; i < dataBarang.size(); i++) {
                    
                    dm.setRowCount(counter);
                    String JudulData = dataBarang.get(i).getJudul();
                    String NamaPengarangData = dataBarang.get(i).getNamaPengarang();
                    String PenerbitData = dataBarang.get(i).getPenerbit();
                    int TahunTerbitData = dataBarang.get(i).getTahunTerbit();
                    String KategoriData = dataBarang.get(i).getKategori();

                    Object[]dataUtama = {JudulData,NamaPengarangData,PenerbitData,TahunTerbitData,KategoriData};
                    dm.addRow(dataUtama);
                    
                    counter++;
                }
                
                txtJudul.setText("");
                txtNamaPengarang.setText("");
                txtPenerbit.setText("");
                txtTahunCetak.setText("");
                kategoriBox.setSelectedItem("Semua Umur");

            }

        });

        
        add(labelJudul);
        add(txtJudul);
        add(labelNamaPengarang);
        add(txtNamaPengarang);
        add(labelPenerbit);
        add(txtPenerbit);
        add(labelTahunCetak);
        add(txtTahunCetak);
        add(labelKategori);
        add(kategoriBox);
        add(spDataTabel);
        add(addButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void tambahData(String judul,String namaPengarang,String penerbit,int tahunterbit,String kategori){
        dataBarang.add(new dataKomponen(judul,namaPengarang,penerbit,tahunterbit,kategori));
    }

    // private Object tambahData(String judul,String namaPengarang,String penerbit,int tahunterbit,String kategori){
    //     Object data =  dataBarang.add(new dataKomponen(judul,namaPengarang,penerbit,tahunterbit,kategori));
    //     return data;
    // }

}
