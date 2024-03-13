/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasSwing_123220101;

/**
 *
 * @author Aibra
 */

import javax.swing.*;
import java.awt.*;


class HomePage extends JFrame{
    
    JLabel teks1 = new JLabel("Welcome, [Mr./Mrs.] [Username]");
    JLabel teks2 = new JLabel("tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    
    JLabel tagpanjang = new JLabel("Panjang");
    JTextField panjang = new JTextField();
    
    JLabel taglebar = new JLabel("Lebar");
    JTextField lebar = new JTextField();
    
    JLabel tagtinggi = new JLabel("Lebar");
    JTextField tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");

    JLabel teks3 = new JLabel("Hasil");
    JLabel teks4 = new JLabel("Luas Persegi");
    JLabel teks5 = new JLabel("[Hasil berupa angka]");
    JLabel teks6 = new JLabel("Keliling Persegi");
    JLabel teks7 = new JLabel("[Hasil berupa angka]");
    JLabel teks8 = new JLabel("Volume Balok");
    JLabel teks9 = new JLabel("[Hasil berupa angka]");
    JLabel teks10 = new JLabel("Luas Permukaan Balok");
    JLabel teks11 = new JLabel("[Hasil berupa angka]");
    
    HomePage(){
        setVisible(true);
        setSize(720,720);
        setResizable(false);
        
        setTitle("halaman Utama");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(teks1);
        teks1.setBounds(10, 20, 500, 30);
        teks1.setFont(new Font("Arial", Font.BOLD, 22));
        
        add(teks2);
        teks2.setBounds(10, 50, 500, 30);
        teks2.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(tagpanjang);
        tagpanjang.setBounds(10, 120, 100, 30);
        tagpanjang.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(panjang);
        panjang.setBounds(150, 120, 500, 30);
        panjang.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(taglebar);
        taglebar.setBounds(10, 170, 100, 30);
        taglebar.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(lebar);
        lebar.setBounds(150, 170, 500, 30);
        lebar.setFont(new Font("Arial", Font.BOLD, 15));

         add(tagtinggi);
        tagtinggi.setBounds(10, 220, 100, 30);
        tagtinggi.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(tinggi);
        tinggi.setBounds(150, 220, 500, 30);
        tinggi.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(hitung);
        hitung.setBounds(10, 270, 685, 35);
        hitung.setFont(new Font("Arial", Font.BOLD, 15));
        hitung.setBackground(Color.WHITE);
        
        add(reset);
        reset.setBounds(10, 320, 685, 35);
        reset.setFont(new Font("Arial", Font.BOLD, 15));
        reset.setBackground(Color.WHITE);
        
        add(teks3);
        teks3.setBounds(335, 380, 100, 30);
        teks3.setFont(new Font("Arial", Font.BOLD, 18));
        
        add(teks4);
        teks4.setBounds(10, 420, 100, 30);
        teks4.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks5);
        teks5.setBounds(300, 420, 250, 30);
        teks5.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks6);
        teks6.setBounds(10, 450, 200, 30);
        teks6.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks7);
        teks7.setBounds(300, 450, 250, 30);
        teks7.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks8);
        teks8.setBounds(10, 480, 200, 30);
        teks8.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks9);
        teks9.setBounds(300, 480, 250, 30);
        teks9.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks10);
        teks10.setBounds(10, 510, 200, 30);
        teks10.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(teks11);
        teks11.setBounds(300, 510, 250, 30);
        teks11.setFont(new Font("Arial", Font.BOLD, 15));
    }
}

public class HalamanUtama {
    public static void main(String [] args){
        HomePage home = new HomePage();  
    }
}
