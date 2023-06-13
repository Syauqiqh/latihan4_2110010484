
package penilaian;


public class NilaiAkhir extends Mahasiswa {
    int uts,uas,tugas;

    public NilaiAkhir(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public float hitungNilaiAkhir(){
       
        return (uts*30/100)+(uas*30/100)+(tugas*40/100);
    
    }
 
    @Override
 public String getNama(){
     system.out.println("superclass");
     return super.getNama();
 }
    
}
