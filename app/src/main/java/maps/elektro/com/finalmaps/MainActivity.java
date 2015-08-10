package maps.elektro.com.finalmaps;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends ActionBarActivity implements OnMapReadyCallback {

    GoogleMap gMaps;
    double latitude = 5.567172;
    double longitude = 95.367975;


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
        Intent intenthasil = getIntent();

        try {

            initializeMaps();
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.484702, 95.227189))
                    .visible(true)
                    .title("Lampuuk"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.613742, 95.557184))
                    .title("Pasir Putih")
                    .snippet("pantai yang ramai pengunjung setiap minggunya"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.571272, 95.226381))
                    .title("Lhouk mata ie"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.906016, 95.216867))
                    .title("Tugu Nol Kilometer"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.875183, 95.255673))
                    .title("Iboih Sabang"));

            //test
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bandar))
                    .position(new LatLng(5.518049, 95.417221))
                    .title("Bandar Udara Sultan Iskandar Muda"));
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pelabuhan))
                    .position(new LatLng(5.564726, 95.294137))
                    .title("Pelabuhan ulee lheue"));
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pelabuhan))
                    .position(new LatLng(5.597305, 95.527331))
                    .title("Pelabuhan malahayati"));
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.terminal))
                    .position(new LatLng(5.529812, 95.329119))
                    .title("Terminal batoh"));
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.mesjid))
                    .position(new LatLng(5.553598, 95.317650))
                    .title("Mesjid raya baiturrahman"));
//
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.559172, 95.284337))
                    .title("Pantai ulee lheue"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.551545, 95.286376))
                    .title("Waterboom ulee lheue"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.486962, 95.289841))
                    .title("Mataie Hillside"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.450278, 95.367439))
                    .title("Wisata Alam Taman Rusa, Sibreh, Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.419543, 95.404034))
                    .title("Wahana impian Malaka, Kutamalaka, Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.364700, 95.481007))
                    .title("waduk keliling, Kuta cot glie, Aceh besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.476816, 95.714189))
                    .title("Saree Aceh, Lembah seulawah, Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pelabuhan))
                    .position(new LatLng(5.238662, 97.035589))
                    .title("Pelabuhan Krueng geukueh"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.808729, 95.307655))
                    .title("Gunung Berapi Jaboi, Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.bandar))
                    .position(new LatLng(5.871464, 95.341681))
                    .title("Bandar Udara Maimun Saleh, Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.892762, 95.339519))
                    .title("Pantai Sumur Tiga"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.888442, 95.343850))
                    .title("Casanemo, Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.spbu))
                    .position(new LatLng(5.866670, 95.345315))
                    .title("SPBU 14-235409, Kota Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.847085, 95.373722))
                    .title("Benteng Jepang, Kota Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.837190, 95.373915))
                    .title("Pantai Anoi Itam, Kota Sabang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.pelabuhan))
                    .position(new LatLng(5.826956, 95.347231))
                    .title("Pelabuhan Balohan"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.853319, 95.270376))
                    .title("Pantai gapang"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.893201, 95.311363))
                    .title("Sabang Fair"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(4.647343, 96.807856))
                    .title("Pantan Terong, Takengon"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(4.629911, 96.862150))
                    .title("Danau Laut Tawar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(2.177850, 97.248843))
                    .title("Pulau Banyak"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.697197, 95.090978))
                    .title("Pulo Aceh"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.265037, 95.245556))
                    .title("Pantai Jantang (Hidden Beach), Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.284823, 95.261993))
                    .title("Air Terjun Suhom, Lhoong, Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.367738, 95.284268))
                    .title("Brayeung Leupung, Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.547023, 95.547619))
                    .title("Pemandian Air Panas Aceh Besar"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.wisataa))
                    .position(new LatLng(5.616388, 95.544274))
                    .title("Wisata Bukit Lamreh, ujung kelindu, Aceh Besar"));

            gMaps.setMyLocationEnabled(true);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.553670, 95.318832)).zoom(10).build();

            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, null);


        } catch (Exception e) {

        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void initializeMaps() {
        if (gMaps == null) {
            gMaps = ((MapFragment) getFragmentManager().findFragmentById(R.id.maps)).getMap();

            if(gMaps == null) {
                Toast.makeText(getApplicationContext(), "Unable to create maps", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMaps.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        gMaps.setMapType(GoogleMap.MAP_TYPE_HYBRID);






    }
}
