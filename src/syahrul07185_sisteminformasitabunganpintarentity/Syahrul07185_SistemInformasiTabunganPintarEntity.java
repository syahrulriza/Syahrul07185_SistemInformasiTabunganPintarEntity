
package syahrul07185_sisteminformasitabunganpintarentity;
import java.util.ArrayList;
import java.util.Scanner;

public class Syahrul07185_SistemInformasiTabunganPintarEntity {
 ArrayList<Syahrul07185_DataPengguna> syahrul07185_user=new ArrayList();
 ArrayList<syahrul07185_DataTabunganPintar> syahrul07185_TabunganPintar=new ArrayList();
 Scanner syahrul07185_input=new Scanner(System.in);
    
    public static void main(String[] args) {
        Syahrul07185_SistemInformasiTabunganPintarEntity syahrul07185_data=new Syahrul07185_SistemInformasiTabunganPintarEntity();
      int syahrul07185_pil;
        do{
        System.out.println("1.Daftar Akun");
        System.out.println("2.Login");
        System.out.println("3.hapus Data");
        System.out.println("4.Update Data");
        System.out.println("5.Exit");
        System.out.print("Pilih = ");
         syahrul07185_pil=syahrul07185_data.syahrul07185_input.nextInt();
        switch(syahrul07185_pil){
            case 1:
                syahrul07185_data.syahrul07185_daftar();
                break;
            case 2:
                System.out.print("Email = ");
                String syahrul07185_Email=syahrul07185_data.syahrul07185_input.next();
                System.out.print("Password = ");
                String syahrul07185_Password=syahrul07185_data.syahrul07185_input.next();
                syahrul07185_data.syahrul07185_menuutama(syahrul07185_Email,syahrul07185_Password);
                break;
            case 3:
                System.out.println("Data Sebelum Dihapus : ");
                for(int a=0;a<syahrul07185_data.syahrul07185_user.size();a++){
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_nama());
                    System.out.println("Target Menabung = "+syahrul07185_data.syahrul07185_TabunganPintar.get(a).syahrul07185_target);
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_email());
                    System.out.println("");
                }
                System.out.print("Nama Yang Dihapus = ");
                String syahrul07185_nama1=syahrul07185_data.syahrul07185_input.next();
                syahrul07185_data.syahrul07185_hapusnama(syahrul07185_nama1);
                System.out.println("");
                System.out.println("Data Sesudah Dihapus : ");
                for(int a=0;a<syahrul07185_data.syahrul07185_user.size();a++){
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_nama());
                    System.out.println("Target Menabung = "+syahrul07185_data.syahrul07185_TabunganPintar.get(a).syahrul07185_target);
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_email());
                    System.out.println("");
                }
                break;
            case 4:
                    System.out.println("Data Sebelum Diupdate : ");
                for(int a=0;a<syahrul07185_data.syahrul07185_user.size();a++){
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_nama());
                    System.out.println("Target Menabung = "+syahrul07185_data.syahrul07185_TabunganPintar.get(a).syahrul07185_target);
                    System.out.println("Email = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_email());
                    System.out.println("");
                }
                System.out.print("Nama = ");
                String syahrul07185_nama=syahrul07185_data.syahrul07185_input.next();
              
                syahrul07185_data.syahrul07185_update(syahrul07185_nama);
                    System.out.println("Data Sesudah Diupdate : ");
                for(int a=0;a<syahrul07185_data.syahrul07185_user.size();a++){
                    System.out.println("Nama = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_nama());
                    System.out.println("Target Menabung = "+syahrul07185_data.syahrul07185_TabunganPintar.get(a).syahrul07185_target);
                    System.out.println("Email = "+syahrul07185_data.syahrul07185_user.get(a).getSyahrul07185_email());
                    System.out.println("");
                }
                
        }
        }while(syahrul07185_pil!=5);
    }
    void syahrul07185_daftar(){
        System.out.print("Nama = ");
        String syahrul07185_nama=syahrul07185_input.next();
        System.out.print("Jenis Kelamin = ");
        String syahrul07185_jeniskelamin=syahrul07185_input.next();
        System.out.print("Masukan Email = ");
        String syahrul07185_Email=syahrul07185_input.next();
        System.out.print("Masukan Password = ");
        String syahrul07185_Password=syahrul07185_input.next();
        syahrul07185_user.add(new Syahrul07185_DataPengguna(syahrul07185_Email,syahrul07185_nama,syahrul07185_Password,syahrul07185_jeniskelamin));
         
    } 
    void syahrul07185_update(String syahrul07185_nama){
       if(syahrul07185_carinama(syahrul07185_nama)!=-1){
             System.out.print("Email Baru = ");
                String syahrul07185_email=syahrul07185_input.next();
           syahrul07185_user.get(syahrul07185_carinama(syahrul07185_nama)).Syahrul07185_email=syahrul07185_email;
       }
   }
    int syahrul07185_carinama(String syahrul07185_nama){
       int indeks=-1;
       for(int a=0;a<syahrul07185_user.size();a++){
           if(syahrul07185_nama.equals(syahrul07185_user.get(a).getSyahrul07185_nama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
    void syahrul07185_hapusnama(String syahrul07185_nama){
       syahrul07185_user.remove(syahrul07185_carinama(syahrul07185_nama));
   }
   
     void syahrul07185_menuutama(String syahrul07185_Email,String syahrul07185_Password){
        int syahrul07185_jangkawaktuterkumpul1,syahrul07185_jangkawaktuterkumpul2,syahrul07185_bulan,syahrul07185_kurang;
        for(int syahrul07185_a=0;syahrul07185_a<syahrul07185_user.size();syahrul07185_a++){
            if(syahrul07185_Email.equals(syahrul07185_user.get(syahrul07185_a).getSyahrul07185_email())&&syahrul07185_Password.equals(syahrul07185_user.get(syahrul07185_a).getSyahrul07185_password())){
                System.out.println("Nama = "+syahrul07185_user.get(syahrul07185_a).getSyahrul07185_nama());
                System.out.println("Jenis Kelamin = "+syahrul07185_user.get(syahrul07185_a).getSyahrul07185_jeniskelamin());
                System.out.println("");
                System.out.print("Nominal menabung = ");
                int syahrul07185_menabung=syahrul07185_input.nextInt();
                System.out.print("Target Menabung = ");
                int syahrul07185_target=syahrul07185_input.nextInt();
                if(syahrul07185_target<=500000&&syahrul07185_menabung<500000){
                     System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+syahrul07185_target);  
                }else if(syahrul07185_target>500000&&syahrul07185_menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+syahrul07185_target);   
                }else{
                     System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar "+syahrul07185_target);  
                }
                System.out.println("Menabung (perhari/perbulan)");
                System.out.println("1)perhari");
                System.out.println("2)perbulan");
                System.out.print("Pilih = ");
                int syahrul07185_sekalamenabung=syahrul07185_input.nextInt();
                syahrul07185_jangkawaktuterkumpul1=syahrul07185_target/syahrul07185_menabung;
                switch(syahrul07185_sekalamenabung){
                    case 1:
                         if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung&&syahrul07185_jangkawaktuterkumpul1<=30){
                        System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul1+" hari");
                        syahrul07185_jangkawaktuterkumpul2=0;
                        syahrul07185_bulan=0;
                        syahrul07185_kurang=0;
                        syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                        
                    }else if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung&&syahrul07185_jangkawaktuterkumpul1>30){
                        syahrul07185_bulan=syahrul07185_jangkawaktuterkumpul1/30;
                        System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_bulan+" bulan");
                       syahrul07185_kurang=0;
                        syahrul07185_jangkawaktuterkumpul2=0;
                        syahrul07185_jangkawaktuterkumpul1=0;
                         syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                    }else if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung&&syahrul07185_jangkawaktuterkumpul1>365){
                        syahrul07185_jangkawaktuterkumpul2=syahrul07185_jangkawaktuterkumpul1/365;
                        syahrul07185_bulan=(syahrul07185_jangkawaktuterkumpul1-365)/30;
                        System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul1+" tahun "+syahrul07185_bulan+" bulan");
                        syahrul07185_kurang=0;
                        syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                    }
                         break;
                    case 2:
                         syahrul07185_jangkawaktuterkumpul2=syahrul07185_jangkawaktuterkumpul1/12;
                    if(syahrul07185_jangkawaktuterkumpul1==syahrul07185_jangkawaktuterkumpul2*12){
                        System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul2+" tahun");
                         syahrul07185_bulan=0;
                            syahrul07185_kurang=0;
                        syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                    }else{
                        syahrul07185_bulan=syahrul07185_jangkawaktuterkumpul1-(syahrul07185_jangkawaktuterkumpul2*12);
                        if(syahrul07185_target==syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung&&syahrul07185_jangkawaktuterkumpul1>12){
                            System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul2+" tahun "+syahrul07185_bulan+" bulan");
                            syahrul07185_bulan=0;
                            syahrul07185_kurang=0;
                            syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                        }else if(syahrul07185_jangkawaktuterkumpul1<12){
                             System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul1+" bulan");
                             syahrul07185_kurang=0;
                             syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                        }else{
                            syahrul07185_kurang=syahrul07185_target-(syahrul07185_jangkawaktuterkumpul1*syahrul07185_menabung);
                            System.out.println(syahrul07185_target+" akan terkumpul "+syahrul07185_jangkawaktuterkumpul2+" tahun "+syahrul07185_bulan+" bulan");
                            System.out.println("Dengan catatan dibulan terakhir, menabung "+syahrul07185_kurang+syahrul07185_menabung);
                            syahrul07185_TabunganPintar.add(new syahrul07185_DataTabunganPintar(syahrul07185_jangkawaktuterkumpul1, syahrul07185_jangkawaktuterkumpul2, syahrul07185_bulan, syahrul07185_kurang, syahrul07185_target, syahrul07185_menabung, syahrul07185_sekalamenabung));
                        }
                    }
                
                        
                }
               }else{
                System.out.println("Email atau Password Salah");
            }
        }
    }
}
