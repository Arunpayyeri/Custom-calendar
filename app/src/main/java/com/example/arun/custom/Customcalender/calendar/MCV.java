package com.example.arun.custom.Customcalender.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.arun.custom.Customcalender.MyCalendarView;
import com.example.arun.custom.Customcalender.TimePicker;
import com.example.arun.custom.R;

import java.util.List;

import static com.example.arun.custom.Customcalender.MyCalendarView.Language.Arabic;

public class MCV extends View {
    public MCV(Context context) {
        super(context);
    }

    public MCV(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MCV(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MCV(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public enum Mode {
        Hijri(1),
        Gregorian(2);
        private int mode;

        Mode(int mode) {
            this.mode = mode;
        }

        public int getModeValue() {
            return mode;
        }
    }
    public enum Language {
        Arabic(1),
        English(2),
        Default(3);
        private int language;

        Language(int language) {
            this.language = language;
        }

        public int getLanguageValue() {
            return language;
        }
    }


    public static String title;
    public static int language;
    public static MyCalendarView.OnDateSetListener onDateSetListener;
    public static MyCalendarView.Mode mode = MyCalendarView.Mode.Gregorian;
    public static int hijri_min;
    public static int hijri_max;
    public static int gregorian_min;
    public static int gregorian_max;
    public static boolean setDefaultDate = false;
    public static int defaultDay;
    public static int defaultMonth;
    public static int defaultYear;
    public static boolean scrolling;

    private Context context;
    private String[] days;
    private TextView monthTextView, yearTextView, lastSelectedDay;
    private TableLayout tableLayout, tableLayoutDay;
    private CalendarInstance calendarInstance;
    private List<TextView> textViewList;
    private TableRow daysHeader;
    ImageView nextButton, previousButton;
    RelativeLayout relative_next,relative_previous;
    Drawable drawableSelect;

    TimePicker timePicker;
    TextView tv_done;
    TextView tv_cancel;

    LinearLayout linear_calendar_header,linear_timer_header;
    LinearLayout linear_timePicker,linear_datePicker;
    public TextView hedertextview;
    TextView tv_timepicker_title;

    LinearLayout linear_calendar;
    RelativeLayout linear_datepicker_header;
    LinearLayout linear_bottom_button;

    /*public interface OnDateSetListener {
        @Deprecated
        void onDateSet(int year, int month, int day, int hour, int minute, int seconds, String ampm);
    }
*/

}
