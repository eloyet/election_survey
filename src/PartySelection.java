
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elify
 */

public class PartySelection extends javax.swing.JFrame {

    /**
     * Creates new form PartySelection
     */

    public PartySelection() {

        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("flagicon.png")));
        EqualityCandidates();
        FelicityCandidates();
        FreedomCandidates();
        LabourCandidates();
        ModernLiberationCandidates();
        NationalPeopleCandidates();
        NewDemocraticCandidates();
        NewDemocraticCandidates();
        NewNatureCandidates();
        PeopleActionCandidates();
        RepublicanPeopleCandidates();
        UnitedWorkersCandidates();
        UniversalLeftCandidates();
        AllCand();
        setTitle("Party Selection");

          continuebutton.addActionListener(new ActionListener() {
         
   public void actionPerformed(java.awt.event.ActionEvent e) {
       
   
        try {
           FileWriter file = new FileWriter("partyvotes.txt",true);
         
            
               
         if(EqualityParty.isSelected()){
           file.write("EqualityParty\n");

        }
         
        if(FelicityParty.isSelected()){
          file.write("FelicityParty \n");
        }
        if(FreedomParty.isSelected()){
           file.write("FreedomParty \n"); 
        }
        if(LabourParty.isSelected()){
           file.write("LabourParty \n");
        }
        if(ModernLiberationParty.isSelected()){
           file.write("ModernLiberationParty\n"); 
        }
        if(NationalPeopleParty.isSelected()){
            file.write("NationalPeopleParty \n");
        }
        if(NewDemocraticParty.isSelected()){
           file.write("NewDemocraticParty \n");
        }
        if(NewNatureParty.isSelected()){
            file.write("NewNatureParty \n");
        }
        if(PeopleActionParty.isSelected()){
           file.write("PeopleActionParty\n");
        }
        if(RepublicanPeopleParty.isSelected()){
            file.write("RepublicanPeopleParty\n");
        }
        if(UnitedWorkersParty.isSelected()){
          file.write("UnitedWorkersParty \n");
        }
        if(UniversalLeftParty.isSelected()){
          file.write("UniversalLeftParty \n");
        }
                
                
            
            file.close();
        } 
    catch (IOException evt) {
        evt.printStackTrace();
    }
    
   }}); 
    }   
         ArrayList Equality = new ArrayList();
         ArrayList Felicity= new ArrayList();
         ArrayList Freedom= new ArrayList();
         ArrayList Labour= new ArrayList();
         ArrayList ModernLiberation= new ArrayList();
         ArrayList NationalPeople= new ArrayList();
         ArrayList NewDemocratic= new ArrayList();
         ArrayList NewNature= new ArrayList();
         ArrayList PeopleAction= new ArrayList();
         ArrayList RepublicanPeople= new ArrayList();
         ArrayList UnitedWorkers= new ArrayList();
         ArrayList UniversalLeft= new ArrayList();
         ArrayList AllCandidates = new ArrayList();

        
     
   
   public void  EqualityCandidates(){
        
        Equality.add("Elif Yetkinoğlu");
        Equality.add("Bircan Turna");
        Equality.add("Aysegul Yetkinoglu");
        Equality.add("Cem Adıguzel");
        Equality.add("Guler Turan");
        Equality.add("Yagiz Yet");
        Equality.add("Fatih Demir");
        Equality.add("Tugce Yetkin");
        Equality.add("Altay Moler");
        Equality.add("Zeynep Bilge");
        Equality.add("Sakir Cetin");
        Equality.add("Gulden Yet");
        Equality.add("Funda Yelki");
        Equality.add("Ceyda Oguz");
        Equality.add("Arda Deniz");
        Equality.add("Ayça Genc");
        Equality.add("Ali Gencer");
        Equality.add("Esin Okur");
        Equality.add("Ekin Gorgu");
        Equality.add("Beyza Kercek");
        Equality.add("Gulce Gorgulu");
        Equality.add("Ece Acan");
        Equality.add("Deniz Celik");
        Equality.add("Suna Deniz");
        Equality.add("Yaren Demirhan");
        Equality.add("Olimpia Ahenk");
        Equality.add("Yigit Daglier");
        Equality.add("Mustafa Ayata");
      //  System.out.println(Equality);
    
   
    }
        
       
    public void  FelicityCandidates(){
        
        Felicity.add("Aslan Encu");
        Felicity.add("Nedim Yetkinoglu");
        Felicity.add("Aydeniz Toker");
        Felicity.add("Deniz Arslan");
        Felicity.add("Sehpal Atamer");
        Felicity.add("Derin Fırtına");
        Felicity.add("Elif Kandemir");
        Felicity.add("Suzan Toker");
        Felicity.add("Cemre Yetin");
        Felicity.add("Onur Diken");
        Felicity.add("Egemen Akbal");
        Felicity.add("Yavuz Üye");
        Felicity.add("Berkin Akbıyık");
        Felicity.add("Berk Bostan");
        Felicity.add("Ozgur Sahin");
        Felicity.add("Hande Celik");
        Felicity.add("Selen Oz");
        Felicity.add("Ece Andaç");
        Felicity.add("Ozlem Toy");
        Felicity.add("Elif Aslı");
        Felicity.add("İlayda Ulku");
        Felicity.add("Leyla Varol");
        Felicity.add("Tuncer Erdem");
        Felicity.add("Batu Er");
        Felicity.add("Levent Uysal");
        Felicity.add("Yagiz Bay");
        Felicity.add("Erkan Silek");
        Felicity.add("Ozlem Akar");
        //System.out.println(Felicity);
      
    }
    public void  FreedomCandidates(){
        
        Freedom.add("Yağız Yetkinoglu");
        Freedom.add("Yagiz Erdem");
        Freedom.add("Burak Kok");
        Freedom.add("Ufuk Zeybek");
        Freedom.add("Toprak Demir");
        Freedom.add("Emrah Altay");
        Freedom.add("Mert Eser");
        Freedom.add("Ahmet Kara");
        Freedom.add("Utku Duman");
        Freedom.add("Hasan Ozkul");
        Freedom.add("Mert Ercan");
        Freedom.add("Altay Goksu");
        Freedom.add("İhsan Ay");
        Freedom.add("Tahsin Kara");
        Freedom.add("Dilara Sever");
        Freedom.add("Melis Savasan");
        Freedom.add("Tugce Karakaplan");
        Freedom.add("Nil Deniz");
        Freedom.add("Sıla Kocak");
        Freedom.add("Melisa Ilıca");
        Freedom.add("Serenay Sarı");
        Freedom.add("Cem Yılmaz");
        Freedom.add("Julide Ataman");
        Freedom.add("Gozde Ata");
        Freedom.add("Merve Erdogan");
        Freedom.add("Melis Selcuk");
        Freedom.add("Asena Yavas");
        Freedom.add("Duygu Bilgi");
        //System.out.println(Freedom);
      
    } 
    public void  LabourCandidates(){
        
        Labour.add("Savas Baris");
        Labour.add("Altar Toker");
        Labour.add("Pırıl Er");
        Labour.add("Fulya Kinay");
        Labour.add("Pelin Toker");
        Labour.add("Lara Tufek");
        Labour.add("Deniz Aksac");
        Labour.add("Elif Sanli ");
        Labour.add("İrem Saklı");
        Labour.add("Merve Unal");
        Labour.add("Bergin Unver");
        Labour.add("Ayca Ertem");
        Labour.add("Begum Yuce");
        Labour.add("Dogus Cabakcor");
        Labour.add("Selen Ornek");
        Labour.add("Aybuke Topcu");
        Labour.add("Berker Sofa");
        Labour.add("Akif Karatas");
        Labour.add("Kıvanc Boz");
        Labour.add("Okan Derin");
        Labour.add("Merve Halıcı");
        Labour.add("Simge Goz");
        Labour.add("Dilara Guney");
        Labour.add("Esra Onal");
        Labour.add("Yadigar Sen");
        Labour.add("Sahin Cirik");
        Labour.add("Goksenin Bulut");
        Labour.add("Goktug Efkan");
        //System.out.println(Labour);
      
    }    
    public void  ModernLiberationCandidates(){
        
        ModernLiberation.add("Betul Karademir");
        ModernLiberation.add("Yesim Boz");
        ModernLiberation.add("Beril Ciner");
        ModernLiberation.add("Hasan Berk");
        ModernLiberation.add("Anıl Reis");
        ModernLiberation.add("Zehra Cemre");
        ModernLiberation.add("Buse Demir");
        ModernLiberation.add("Hande Cansın");
        ModernLiberation.add("Ferah Bozkurt");
        ModernLiberation.add("Yesim Lale");
        ModernLiberation.add("Tolga Altıntas");
        ModernLiberation.add("Sule Altın");
        ModernLiberation.add("Sezer Beyoglu");
        ModernLiberation.add("Nedime Hanım");
        ModernLiberation.add("Fikret Aslan");
        ModernLiberation.add("Berkan Kayserili");
        ModernLiberation.add("Senol Aydın");
        ModernLiberation.add("Fatih Terim");
        ModernLiberation.add("Ata Demirel");
        ModernLiberation.add("Meliksah Altın");
        ModernLiberation.add("Bartu Kucuk");
        ModernLiberation.add("Emrecan Keskin");
        ModernLiberation.add("Mete Tasdemir");
        ModernLiberation.add("Yigit Us");
        ModernLiberation.add("Emre Demir");
        ModernLiberation.add("Ege Akdeniz");
        ModernLiberation.add("Muge Senol");
        ModernLiberation.add("Erman Ercan");
        //System.out.println(ModernLiberation);
      
    }
    
     public void  NationalPeopleCandidates(){
        
        NationalPeople.add("Ege Kirec");
        NationalPeople.add("Omer Yılmaz");
        NationalPeople.add("Hasan Toktay");
        NationalPeople.add("Fulya Muzacı");
        NationalPeople.add("Kardelen Acar");
        NationalPeople.add("Can Ulker");
        NationalPeople.add("Su Aksak");
        NationalPeople.add("Beyza Kercek");
        NationalPeople.add("Barıs Dogac");
        NationalPeople.add("Can Kaya");
        NationalPeople.add("Yigit Sarıkaya");
        NationalPeople.add("Onder Cakıl");
        NationalPeople.add("Metin Can");
        NationalPeople.add("Batu Guven");
        NationalPeople.add("Cumhur Ozen");
        NationalPeople.add("Ali Kanbore");
        NationalPeople.add("Sukru Yılmaz");
        NationalPeople.add("Beste Baydogan");
        NationalPeople.add("Cansu Cosardemir");
        NationalPeople.add("Rusen Demiray");
        NationalPeople.add("Berkay Altınay");
        NationalPeople.add("Alkan Akkus");
        NationalPeople.add("Elvin Savas");
        NationalPeople.add("Kaan Savas");
        NationalPeople.add("Hakan Sanlı");
        NationalPeople.add("Julide Barısan");
        NationalPeople.add("Emir Karakaya");
        NationalPeople.add("Eylul Akalın");
        //System.out.println(NationalPeople);
      
    }
     public void  NewDemocraticCandidates(){
        
        NewDemocratic.add("Gulben Suslu");
        NewDemocratic.add("Cagıl Ates");
        NewDemocratic.add("Alp Oylu");
        NewDemocratic.add("Burcan Durhan");
        NewDemocratic.add("Hasan Kaya");
        NewDemocratic.add("Safak Altın");
        NewDemocratic.add("Merve Sonmez");
        NewDemocratic.add("Hatice Yasar");
        NewDemocratic.add("Derin Mermer");
        NewDemocratic.add("Mahsar Can");
        NewDemocratic.add("Gul Aktas");
        NewDemocratic.add("Onur Alp");
        NewDemocratic.add("Askım Oben");
        NewDemocratic.add("Serap Alev");
        NewDemocratic.add("Basak Musoglu");
        NewDemocratic.add("Deniz Ozmen");
        NewDemocratic.add("Umut Demiroglu");
        NewDemocratic.add("Ozge Bozdag");
        NewDemocratic.add("Nesil Cınar");
        NewDemocratic.add("Gizem İstifer");
        NewDemocratic.add("Barış Subası");
        NewDemocratic.add("Bilgehan Akarsu ");
        NewDemocratic.add("Zetnep Ozcan");
        NewDemocratic.add("Gupse Ozel");
        NewDemocratic.add("Barıs Aran");
        NewDemocratic.add("Arce Celik");
        NewDemocratic.add("Ozgur Ekmek");
        NewDemocratic.add("Aycan Yanac");
        //System.out.println(NewDemocratic);
      
    }
     public void  NewNatureCandidates(){
        
        NewNature.add("Huseyin Yetkinoglu");
        NewNature.add("Vahap Ozaltay");
        NewNature.add("Mustafa Deniz");
        NewNature.add("Omer Aydın");
        NewNature.add("Egehan Arna");
        NewNature.add("Yasmin Peker");
        NewNature.add("Selim Avcı");
        NewNature.add("Gaye Akyol");
        NewNature.add("Melis Esen");
        NewNature.add("Olcan Aydın");
        NewNature.add("Metin Ataoğlu");
        NewNature.add("Yiğit Kaba");
        NewNature.add("Elcin Eser");
        NewNature.add("Meltem Cetingul");
        NewNature.add("Lina Peker");
        NewNature.add("Emre Koc");
        NewNature.add("Melisa Sozmez");
        NewNature.add("Bora Tuyan");
        NewNature.add("Sukran Tasyuran");
        NewNature.add("Ozge Yaslı");
        NewNature.add("Ayhan Caka");
        NewNature.add("Yaprak Catalbas");
        NewNature.add("Bahar Ozmen");
        NewNature.add("Yelda Eker");
        NewNature.add("Koray Kaya");
        NewNature.add("Fırat Nalcakan");
        NewNature.add("Ceren Mina");
        NewNature.add("Gulcin Esen");
        //System.out.println(NewNature);
      
    }
     public void  PeopleActionCandidates(){
        
        PeopleAction.add("Bircan Turna");
        PeopleAction.add("Cem Adıguzel");
        PeopleAction.add("Selin Kurucay");
        PeopleAction.add("Hilal Demir");
        PeopleAction.add("Boran Eroglu");
        PeopleAction.add("Arda Guleyen");
        PeopleAction.add("Arda Parlak");
        PeopleAction.add("Civan Ozel");
        PeopleAction.add("Elif Cumbul");
        PeopleAction.add("Zeynep Meltem");
        PeopleAction.add("Onur Dikenelli");
        PeopleAction.add("Asil Aslan");
        PeopleAction.add("İrem Dogan");
        PeopleAction.add("Derin Batmaz");
        PeopleAction.add("Buse Kızmaz");
        PeopleAction.add("Berker Atamer");
        PeopleAction.add("Ecem Esen");
        PeopleAction.add("Melisa Karakaya");
        PeopleAction.add("Ozan Ali Cetin");
        PeopleAction.add("Batuhan Uskun");
        PeopleAction.add("Yagmur Sıvacı");
        PeopleAction.add("Asya Eginc");
        PeopleAction.add("Bahar Safak");
        PeopleAction.add("Melisa Orhon");
        PeopleAction.add("Zeynep Koc");
        PeopleAction.add("Melis Kaya");
        PeopleAction.add("Meltem Celikay");
        PeopleAction.add("Efecan Yetim");
        //System.out.println(NewNature);
      
    }
     public void RepublicanPeopleCandidates(){
        
        RepublicanPeople.add("Demet Acan");
        RepublicanPeople.add("Sarp Yaman");
        RepublicanPeople.add("Aslan Cankan");
        RepublicanPeople.add("Kaplan Kasım");
        RepublicanPeople.add("Hazal Kaya");
        RepublicanPeople.add("Ali Atay");
        RepublicanPeople.add("Fatma Acar");
        RepublicanPeople.add("Sennur Agnar");
        RepublicanPeople.add("Tutku Enkar");
        RepublicanPeople.add("Sevin Ak");
        RepublicanPeople.add("Servey Akçay");
        RepublicanPeople.add("Sarper Işık");
        RepublicanPeople.add("Nukhet Aksan ");
        RepublicanPeople.add("Senem Boztepe");
        RepublicanPeople.add("Mithat Ozer");
        RepublicanPeople.add("Asiye Boz");
        RepublicanPeople.add("Taha Canan");
        RepublicanPeople.add("Sami Karahan");
        RepublicanPeople.add("Halil Demirak");
        RepublicanPeople.add("Seval Andan");
        RepublicanPeople.add("Eymen Ozen");
        RepublicanPeople.add("Açıl Kaçmaz");
        RepublicanPeople.add("İlhan Saymaz");
        RepublicanPeople.add("Efe Kayaalp");
        RepublicanPeople.add("Ebru Oguz");
        RepublicanPeople.add("Bilal Sevim");
        RepublicanPeople.add("Aras İynemli");
        RepublicanPeople.add("Alkan Meşe");
        
        //System.out.println(RepublicanPeople);
      
    }
     public void  UnitedWorkersCandidates(){
        
 
         UnitedWorkers.add("Ozan Gokce");
        UnitedWorkers.add("Büşra Pekin");
        UnitedWorkers.add("Yılmaz Erdoğdu");
        UnitedWorkers.add("Nisa Ezgin");
        UnitedWorkers.add("Cihan Durgun");
        UnitedWorkers.add("Sevilay Yengi");
        UnitedWorkers.add("Yusuf Aktaş");
        UnitedWorkers.add("Ümit Doğu");
        UnitedWorkers.add("Ebru Oğuz");
        UnitedWorkers.add("Mustafa Erdem");
        UnitedWorkers.add("Melek Yagmur");
        UnitedWorkers.add("Bekir Atiş");
        UnitedWorkers.add("Veli Cem");
        UnitedWorkers.add("Sinem Akay");
        UnitedWorkers.add("Yusuf Kurt");
        UnitedWorkers.add("Serdar Sandal");
        UnitedWorkers.add("Cemal Kerim");
        UnitedWorkers.add("Huseyin Mutlu");
        UnitedWorkers.add("Ali Engin");
        UnitedWorkers.add("Cihan Tursen");
        UnitedWorkers.add("Taha Okan");
        UnitedWorkers.add("Sercan Algun");
        UnitedWorkers.add("Rıdvan Karakayalı");
        UnitedWorkers.add("Ahmet Ozkan");
        UnitedWorkers.add("Salim Ozkarakas");
        UnitedWorkers.add("Sema Pekdas");
        UnitedWorkers.add("Birgul Degirmenci");
        UnitedWorkers.add("Mehmet Turkbay");
        //System.out.println(UnitedWorkers);
      
    }
     public void UniversalLeftCandidates(){
        
        UniversalLeft.add("Sibel Bezci");
        UniversalLeft.add("Vedat Uğur");
        UniversalLeft.add("Birgül Değirmenci");
        UniversalLeft.add("Asuman Ali Güven");
        UniversalLeft.add("Celal Polat");
        UniversalLeft.add("Zerrin Ak");
        UniversalLeft.add("Ergun Ozgun");
        UniversalLeft.add("Celal Yıldız");
        UniversalLeft.add("Omer Guney");
        UniversalLeft.add("Ezgi Urunga");
        UniversalLeft.add("Devrim Kırlangıç");
        UniversalLeft.add("Öztürk Kurt");
        UniversalLeft.add("İlkay Girgin");
        UniversalLeft.add("Kadir Sinan");
        UniversalLeft.add("Mustafa İnceoğlu");
        UniversalLeft.add("Günal Biçer");
        UniversalLeft.add("Fatih Gürbüz");
        UniversalLeft.add("Gökalp Suvari");
        UniversalLeft.add("Halil Arda");
        UniversalLeft.add("İsmail Hakkı");
        UniversalLeft.add("Deniz Baykal");
        UniversalLeft.add("Mehmet Şakir");
        UniversalLeft.add("Levent Piriştina");
        UniversalLeft.add("Ercan Tatlı");
        UniversalLeft.add("Tunç Soyer");
        UniversalLeft.add("İdris Koçova");
        UniversalLeft.add("Yamaç Yılmazlar");
        UniversalLeft.add("Cemal Kemal");
      
        
        //System.out.println(UniversalLeft);
      
    }
     public void AllCand(){
        AllCandidates.addAll(Equality);
        AllCandidates.addAll(Felicity);
        AllCandidates.addAll(Freedom);
        AllCandidates.addAll(ModernLiberation);
        AllCandidates.addAll(Labour);
        AllCandidates.addAll(NationalPeople);
        AllCandidates.addAll(NewDemocratic);
        AllCandidates.addAll(NewNature);
        AllCandidates.addAll(PeopleAction);
        AllCandidates.addAll(RepublicanPeople);
        AllCandidates.addAll(UnitedWorkers);
        AllCandidates.addAll(UniversalLeft);

     // System.out.println(AllCandidates);
     }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FelicityParty = new javax.swing.JRadioButton();
        FreedomParty = new javax.swing.JRadioButton();
        LabourParty = new javax.swing.JRadioButton();
        NewDemocraticParty = new javax.swing.JRadioButton();
        ModernLiberationParty = new javax.swing.JRadioButton();
        EqualityParty = new javax.swing.JRadioButton();
        NationalPeopleParty = new javax.swing.JRadioButton();
        UnitedWorkersParty = new javax.swing.JRadioButton();
        PeopleActionParty = new javax.swing.JRadioButton();
        NewNatureParty = new javax.swing.JRadioButton();
        UniversalLeftParty = new javax.swing.JRadioButton();
        RepublicanPeopleParty = new javax.swing.JRadioButton();
        continuebutton = new javax.swing.JButton();
        None = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Which party will you vote for?");

        FelicityParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(FelicityParty);
        FelicityParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FelicityParty.setForeground(new java.awt.Color(51, 51, 51));
        FelicityParty.setText("Felicity Party");

        FreedomParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(FreedomParty);
        FreedomParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FreedomParty.setForeground(new java.awt.Color(51, 51, 51));
        FreedomParty.setText("Freedom Party");

        LabourParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(LabourParty);
        LabourParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabourParty.setForeground(new java.awt.Color(51, 51, 51));
        LabourParty.setText("Labour Party ");

        NewDemocraticParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(NewDemocraticParty);
        NewDemocraticParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewDemocraticParty.setForeground(new java.awt.Color(51, 51, 51));
        NewDemocraticParty.setText("New Democratic Party");

        ModernLiberationParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(ModernLiberationParty);
        ModernLiberationParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ModernLiberationParty.setForeground(new java.awt.Color(51, 51, 51));
        ModernLiberationParty.setText("Modern Liberation Party ");

        EqualityParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(EqualityParty);
        EqualityParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        EqualityParty.setForeground(new java.awt.Color(51, 51, 51));
        EqualityParty.setText("Equality Party");

        NationalPeopleParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(NationalPeopleParty);
        NationalPeopleParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NationalPeopleParty.setForeground(new java.awt.Color(51, 51, 51));
        NationalPeopleParty.setText("National People's Party");

        UnitedWorkersParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(UnitedWorkersParty);
        UnitedWorkersParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UnitedWorkersParty.setForeground(new java.awt.Color(51, 51, 51));
        UnitedWorkersParty.setText("United Workers' Party");

        PeopleActionParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(PeopleActionParty);
        PeopleActionParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PeopleActionParty.setForeground(new java.awt.Color(51, 51, 51));
        PeopleActionParty.setText("People's Action Party");

        NewNatureParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(NewNatureParty);
        NewNatureParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewNatureParty.setForeground(new java.awt.Color(51, 51, 51));
        NewNatureParty.setText("New Nature Party ");

        UniversalLeftParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(UniversalLeftParty);
        UniversalLeftParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UniversalLeftParty.setForeground(new java.awt.Color(51, 51, 51));
        UniversalLeftParty.setText("Universal Left Party ");

        RepublicanPeopleParty.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(RepublicanPeopleParty);
        RepublicanPeopleParty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RepublicanPeopleParty.setForeground(new java.awt.Color(51, 51, 51));
        RepublicanPeopleParty.setText("Republican People's Party ");

        continuebutton.setBackground(new java.awt.Color(0, 153, 255));
        continuebutton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        continuebutton.setText("Continue");
        continuebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuebuttonActionPerformed(evt);
            }
        });

        None.setBackground(new java.awt.Color(204, 204, 204));
        None.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        None.setForeground(new java.awt.Color(51, 51, 51));
        None.setText("None");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FreedomParty)
                            .addComponent(FelicityParty)
                            .addComponent(LabourParty)
                            .addComponent(NewDemocraticParty)
                            .addComponent(ModernLiberationParty)
                            .addComponent(EqualityParty)
                            .addComponent(NationalPeopleParty)
                            .addComponent(UnitedWorkersParty)
                            .addComponent(PeopleActionParty)
                            .addComponent(NewNatureParty)
                            .addComponent(UniversalLeftParty)
                            .addComponent(None)
                            .addComponent(RepublicanPeopleParty))))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(FelicityParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FreedomParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabourParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewDemocraticParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModernLiberationParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EqualityParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NationalPeopleParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UnitedWorkersParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PeopleActionParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewNatureParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UniversalLeftParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RepublicanPeopleParty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(None)
                        .addGap(25, 25, 25)
                        .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    String eqvote;
    String felvote ;
    String frevote;
    String labvote;
    String modvote;
    String natvote;
    String demvote;
    String naturevote;
    String repvote;
    String pevote;
    String workvote;
    String leftvote;
    ArrayList list = new ArrayList();
    
        
   

    
     private void continuebuttonActionPerformed(java.awt.event.ActionEvent evt) {  
         
        if(EqualityParty.isSelected()){
               list.add("eqvote");
           //  System.out.println(eqvote);
             JOptionPane.showMessageDialog(rootPane,"Selected Equality Party.");
             EqualityFrame newframe = new EqualityFrame();
             newframe.setVisible(true);
        }
         
        if(FelicityParty.isSelected()){
           list.add("felvote");
            JOptionPane.showMessageDialog(rootPane,"Selected Felicity Party.");
            FelicityFrame newframe = new FelicityFrame();
             newframe.setVisible(true);
        }
        if(FreedomParty.isSelected()){
            list.add("frevote");
            JOptionPane.showMessageDialog(rootPane,"Selected Freedom Party.");
            FreedomFrame newframe = new FreedomFrame();
             newframe.setVisible(true);
        }
        if(LabourParty.isSelected()){
            list.add("labvote");
            JOptionPane.showMessageDialog(rootPane,"Selected Labour Party.");
            LabourFrame newframe = new LabourFrame();
             newframe.setVisible(true);
        }
        if(ModernLiberationParty.isSelected()){
            list.add("modvote");
            JOptionPane.showMessageDialog(rootPane,"Selected Modern Liberation Party.");
            ModernLiberationFrame newframe = new ModernLiberationFrame();
             newframe.setVisible(true);
        }
        if(NationalPeopleParty.isSelected()){
            
            list.add("natvote");
            JOptionPane.showMessageDialog(rootPane,"Selected National People Party.");
            NationalPeopleFrame newframe = new NationalPeopleFrame();
             newframe.setVisible(true);
        }
        if(NewDemocraticParty.isSelected()){
            list.add("demvote");
            
            JOptionPane.showMessageDialog(rootPane,"Selected New Democratic Party.");
            NewDemocraticFrame newframe = new NewDemocraticFrame();
             newframe.setVisible(true);
        }
        if(NewNatureParty.isSelected()){
            
            list.add("naturevote");
            JOptionPane.showMessageDialog(rootPane,"Selected New Nature Party.");
            NewNatureFrame newframe = new NewNatureFrame();
             newframe.setVisible(true);
        }
        if(PeopleActionParty.isSelected()){
            list.add("pevote");
            JOptionPane.showMessageDialog(rootPane,"Selected People Action Party.");
            PeopleActionFrame newframe = new PeopleActionFrame();
             newframe.setVisible(true);
        }
        if(RepublicanPeopleParty.isSelected()){
            list.add("repvote");
            JOptionPane.showMessageDialog(rootPane,"Selected Republican People Party.");
            RepublicanPeopleFrame newframe = new RepublicanPeopleFrame();
             newframe.setVisible(true);
        }
        if(UnitedWorkersParty.isSelected()){
            list.add("workvote");
            JOptionPane.showMessageDialog(rootPane,"Selected United Workers Party.");
            UnitedWorkersFrame newframe = new UnitedWorkersFrame();
             newframe.setVisible(true);
        }
        if(UniversalLeftParty.isSelected()){
            list.add("leftvote");
            JOptionPane.showMessageDialog(rootPane,"Selected Universal Left Party.");
            UniversalLeftFrame newframe = new UniversalLeftFrame();
             newframe.setVisible(true);
        }
        
        if(None.isSelected()){
           JOptionPane.showMessageDialog(rootPane,"You selected NONE,You are free to choose for 28 candidates.");
           AllCandidates newframe = new AllCandidates();
             newframe.setVisible(true);
             
        }
       try {
          WriteFile();
      } catch (IOException ex) {
          Logger.getLogger(EqualityFrame.class.getName()).log(Level.SEVERE, null, ex);
      }
       //  System.out.println(counter);
     } 
     public void WriteFile() throws IOException{
     
     try{
     FileWriter f = new FileWriter("numofvote.txt",true);
     Writer  output = new BufferedWriter(f);
     int siz = list.size();
     for(int i=0 ; i<siz ; i++){
         output.write(list.get(i).toString()+"\n");
         
     }
     output.close();
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"I cannot create that file.");
     }
     
 }
   
    public ArrayList getEquality() {
       return Equality;
   }
        public ArrayList getFelicity() {
       return Felicity;
   }
        public ArrayList getFreedom() {
       return Freedom;
   }
        public ArrayList getLabour() {
       return Labour;
   }
        public ArrayList getModernLiberation() {
       return ModernLiberation;
   }
        public ArrayList getNationalPeople() {
       return NationalPeople;
   }
        public ArrayList getNewDemocratic() {
       return NewDemocratic;
   }
        public ArrayList getNewNature() {
       return NewNature;
   }
        public ArrayList getPeopleAction() {
       return PeopleAction;
   }
        public ArrayList getRepublicanPeople() {
       return RepublicanPeople;
   }
        public ArrayList getUnitedWorkers() {
       return UnitedWorkers;
   }
        public ArrayList getUniversalLeft() {
       return UniversalLeft;
   }
      public ArrayList getAllCand(){
          return AllCandidates;
      }
        public ArrayList getlist(){
          return list;
      }
   
     /*
    private void continuebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuebuttonActionPerformed
        if(EqualityParty.isSelected()){
             Object isselected = EqualityParty.isSelected();
             Equality.add(vote);
        
               for(int i = 0; i < Equality.size(); i++) {
            System.out.println(Equality.get(i).toString());
        }
             JOptionPane.showMessageDialog(rootPane,"Selected Equality Party.");
             Equality newframe = new Equality();
             newframe.setVisible(true);
        }
        if(FelicityParty.isSelected()){
           Object isselected = FelicityParty.isSelected();

            Felicity.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Felicity Party.");
            Felicity newframe = new Felicity();
             newframe.setVisible(true);
        }
        if(FreedomParty.isSelected()){
            Freedom.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Freedom Party.");
            Freedom newframe = new Freedom();
             newframe.setVisible(true);
        }
        if(LabourParty.isSelected()){
            Labour.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Felicity Party.");
            Labour newframe = new Labour();
             newframe.setVisible(true);
        }
        if(ModernLiberationParty.isSelected()){
            ModernLiberation.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Modern Liberation Party.");
            Equality newframe = new Equality();
             newframe.setVisible(true);
        }
        if(NationalPeopleParty.isSelected()){
            NationalPeople.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected National People Party.");
            NationalPeople newframe = new NationalPeople();
             newframe.setVisible(true);
        }
        if(NewDemocraticParty.isSelected()){
            NewDemocratic.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected New Democratic Party.");
            NewDemocratic newframe = new NewDemocratic();
             newframe.setVisible(true);
        }
        if(NewNatureParty.isSelected()){
            NewNature.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected New Nature Party.");
            NewNature newframe = new NewNature();
             newframe.setVisible(true);
        }
        if(PeopleActionParty.isSelected()){
            PeopleAction.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected People Action Party.");
            PeopleAction newframe = new PeopleAction();
             newframe.setVisible(true);
        }
        if(RepublicanPeopleParty.isSelected()){
            RepublicanPeople.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Republican People Party.");
            RepublicanPeople newframe = new RepublicanPeople();
             newframe.setVisible(true);
        }
        if(UnitedWorkersParty.isSelected()){
            UnitedWorkers.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected United Workers Party.");
            UnitedWorkers newframe = new UnitedWorkers();
             newframe.setVisible(true);
        }
        if(UniversalLeftParty.isSelected()){
            UniversalLeft.add(vote);
            JOptionPane.showMessageDialog(rootPane,"Selected Universal Left Party.");
            UniversalLeft newframe = new UniversalLeft();
             newframe.setVisible(true);
        }
        
        if(NONE.isSelected())
           JOptionPane.showMessageDialog(rootPane,"You selected NONE.");

        
        
        
        
        Candidates newframe = new Candidates();
        newframe.setVisible(true);    }//GEN-LAST:event_continuebuttonActionPerformed

    
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PartySelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartySelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartySelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartySelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartySelection().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EqualityParty;
    private javax.swing.JRadioButton FelicityParty;
    private javax.swing.JRadioButton FreedomParty;
    private javax.swing.JRadioButton LabourParty;
    private javax.swing.JRadioButton ModernLiberationParty;
    private javax.swing.JRadioButton NationalPeopleParty;
    private javax.swing.JRadioButton NewDemocraticParty;
    private javax.swing.JRadioButton NewNatureParty;
    private javax.swing.JRadioButton None;
    private javax.swing.JRadioButton PeopleActionParty;
    private javax.swing.JRadioButton RepublicanPeopleParty;
    private javax.swing.JRadioButton UnitedWorkersParty;
    private javax.swing.JRadioButton UniversalLeftParty;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton continuebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}





































