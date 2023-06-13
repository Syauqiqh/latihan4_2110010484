
package penilaian;


public class NilaiAkhir extends Mahasiswa {

    int uts,uas,tugas;
  
    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama, npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public float hitungNilaiAkhir(){
     
      
        return (uts*30/100)+(uas*30/100)+(tugas*40/100);
    
    }
      
}
