package malviya.chandan.loharsamaj;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.round_profile );

      //  mDisplayDate=(TextView)findViewById ( R.id.dateofbirth );
       /* mDisplayDate.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance ();
                int year = calendar.get ( Calendar.YEAR );
                int month = calendar.get ( Calendar.MONTH );
                int day = calendar.get ( Calendar.DAY_OF_MONTH );

                DatePickerDialog dialog= new DatePickerDialog (
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow ().setBackgroundDrawable ( new ColorDrawable ( Color.TRANSPARENT ) );
                dialog.show ();

                mDateSetListener =new DatePickerDialog.OnDateSetListener () {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month =month + 1;
                        Log.d (TAG, "onDateSet: dd/mm/yyy" + month +"/" + day + "/" + year);
                        String date= day +"/" + month + "/" + year ;
                        mDisplayDate.setText ( date );
                    }
                };
            }
        } );*/

    }
}
