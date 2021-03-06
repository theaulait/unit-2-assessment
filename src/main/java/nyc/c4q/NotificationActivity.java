package nyc.c4q;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends Activity {
    NotificationManager notificationManager;
    public static final int ID_AUTOCANCEL_NOTIFICATION = 1;
    public static final int ID_SWIPE_NOTIFICATION = 2;
    public static final int ID_PERMANENT_NOTIFICATION = 3;
    public static final int ID_BUTTON_NOTIFICATION = 4;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);


        Button autocancelnotification = (Button) findViewById(R.id.autocancelnotification);
        Button swipenotification = (Button) findViewById(R.id.swipenotification);
        Button permanentnotification = (Button) findViewById(R.id.permanentnotification);
        Button dismisspermanentnotification = (Button) findViewById(R.id.dismisspermanentnotification);
        Button buttonnotification = (Button) findViewById(R.id.buttonnotification);

        autocancelnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder builder = new NotificationCompat.Builder(mContext);
                builder.setSmallIcon(R.drawable.c4qfavicon)
                        .setAutoCancel(true)
                        .setContentTitle("default@c4q.nyc")
                        .setContentText("Touch me to dismiss me!");
                Notification n = builder.build();
                n.flags |= Notification.FLAG_AUTO_CANCEL;
                notificationManager.notify(1, n);
            }
        });

        swipenotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(mContext);
                builder.setSmallIcon(R.drawable.c4qfavicon)
                        .setContentTitle("swipe@c4q.nyc")
                        .setContentText("Swipe right if you want to meet me. Otherwise, I'm not going away.");
                Notification n = builder.build();

                notificationManager.notify(2, n);
            }
        });

    }
}
