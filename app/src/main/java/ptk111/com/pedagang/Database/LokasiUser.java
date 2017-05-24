package ptk111.com.pedagang.Database;

/**
 * Created by ptk111 on 5/8/2017.
 */

public class LokasiUser extends Koneksi {
    String URL = "http://agungcahya.esy.es/server.php";
    String url = "";
    String response = "";

    public String tampilLokasiPembeli() {
        try {
            url = URL + "?operasi=viewPembeli";
            System.out.println("URL Tampil Lokasi Pembeli: " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateLokasiPedagangById(Integer id, Double latitude, Double longitude) {
        try {
            url = URL + "?operasi=updatePedagangById&id=" + id + "&latitude=" + latitude + "&longitude=" + longitude;
            System.out.println("URL Update Lokasi Pedagang By ID : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String createAkun(String nama, String telepon ,String username, String password) {
        try {
            url = URL + "?operasi=insertPedagang&nama=" + nama + "&telepon=" + telepon + "&username=" + username + "&password=" + password;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }
}
