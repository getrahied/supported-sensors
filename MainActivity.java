package com.example.devsufy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;
import java.util.List;
public class MainActivity extends AppCompatActivity{
    SensorManager manager;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=(TextView)findViewById(R.id.res);
        manager=(SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors=manager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=1; i<=sensors.size(); i++){
            stringBuilder.append(i+": "+sensors.get(i-
                    1).getName().toString()+"\n");
        }
        res.setText(stringBuilder);
    }
}
