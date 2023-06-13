
package penilaian;


public class main {
    public static void main(String[] args) {
        NilaiAkhir syauqi = new NilaiAkhir("ahmad syauqi khairi","2110010484",85,80,90);
        System.out.println("============= View Data ============");
        System.out.println("nama \t   "+syauqi.getNama());
        System.out.println("npm \t    "+syauqi.getNpm());
        System.out.println("nilai akhir \t "+syauqi.hitungNilaiAkhir());
        System.out.println("============= View Data ============");
        System.out.println("");
    }
}
