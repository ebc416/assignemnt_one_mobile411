package com.example.myapplication;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class assignment_one extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // uncomment below for the screen to be presented horizontally
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        HorizontalScrollView sv = new HorizontalScrollView(this);
        LinearLayout lay = new LinearLayout(this);
        lay.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams D = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        lay.setLayoutParams(D);
        //1. Create a text view object
        TextView v = new TextView(this);
        //2. Set attribute
        v.setText("Rules void hello1(int hour)");
        v.setBackgroundColor(Color.BLACK);
        v.setGravity(Gravity.CENTER_HORIZONTAL);
        v.setTextSize(12);
        v.setTypeface(null, Typeface.BOLD);
        v.setTextColor(Color.WHITE);
        //3.Create Layout Params
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);
        lay.addView(v);
        //---------------------------
        GridLayout grid1 = new GridLayout(this);
        grid1.setRowCount(11);
        grid1.setColumnCount(3);
        TextView tv = new TextView(this);
        tv.setText(" name");
        tv.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec row1 = GridLayout.spec(0);
        GridLayout.Spec col2 = GridLayout.spec(1);
        GridLayout.Spec row4 = GridLayout.spec(3);
        GridLayout.LayoutParams first = new GridLayout.LayoutParams(row1,col2);
        tv.setTextSize(12);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        first.width = 500;
        first.setMargins(5,5,5,5);
        tv.setLayoutParams(first);
        grid1.addView(tv);
        //----------------
        TextView tvPro = new TextView(this);
        tvPro.setText("Properties");
        tvPro.setTypeface(null,Typeface.BOLD);
        GridLayout.Spec row2 = GridLayout.spec(1);
        GridLayout.Spec col1 = GridLayout.spec(0);
        GridLayout.LayoutParams sd = new GridLayout.LayoutParams(row1,col1);
        tvPro.setTextSize(12);
        tvPro.setTextColor(Color.BLACK);
        tvPro.setBackgroundColor(Color.WHITE);
        tvPro.setGravity(Gravity.CENTER_VERTICAL);
        sd.width = 200;
        sd.setMargins(5,5,5,5);
        tvPro.setLayoutParams(sd);
        grid1.addView(tvPro);
        //-----------------
        TextView tvDay = new TextView(this);
        tvDay.setText("Day Hour Classification");
        tvDay.setTypeface(null,Typeface.BOLD);
        GridLayout.Spec row3 = GridLayout.spec(2);
        GridLayout.Spec col3 = GridLayout.spec(2);
        GridLayout.LayoutParams thd = new GridLayout.LayoutParams(row1,col3);
        tvDay.setTextSize(12);
        tvDay.setTextColor(Color.BLACK);
        tvDay.setBackgroundColor(Color.WHITE);
        tvDay.setGravity(Gravity.CENTER_VERTICAL);
        thd.width = 700;
        thd.setMargins(5,5,5,5);
        tvDay.setLayoutParams(thd);
        grid1.addView(tvDay);
        //---------------
        TextView tvBlank = new TextView(this);
        tvBlank.setText("");
        tvBlank.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams BK = new GridLayout.LayoutParams(row2,col1);
        tvBlank.setTextSize(12);
        tvBlank.setTextColor(Color.BLACK);
        tvBlank.setBackgroundColor(Color.WHITE);
        tvBlank.setGravity(Gravity.CENTER_VERTICAL);
        BK.width = 200;
        BK.setMargins(5,5,5,5);
        tvBlank.setLayoutParams(BK);
        grid1.addView(tvBlank);
        //-------------------
        TextView tvRule = new TextView(this);
        tvRule.setText("Rule");
        tvRule.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams ule = new GridLayout.LayoutParams(row3,col1);
        tvRule.setTextSize(12);
        tvRule.setTextColor(Color.BLACK);
        tvRule.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvRule.setGravity(Gravity.CENTER_HORIZONTAL);
        ule.width = 200;
        ule.setMargins(5,5,5,5);
        tvRule.setLayoutParams(ule);
        grid1.addView(tvRule);
        //---------------
        TextView tvCat = new TextView(this);
        tvCat.setText("Category");
        tvCat.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams cat = new GridLayout.LayoutParams(row2,col2);
        tvCat.setTextSize(12);
        tvCat.setTextColor(Color.BLACK);
        tvCat.setBackgroundColor(Color.WHITE);
        tvCat.setGravity(Gravity.CENTER_HORIZONTAL);
        cat.width = 500;
        cat.setMargins(5,5,5,5);
        tvCat.setLayoutParams(cat);
        grid1.addView(tvCat);
        //-----------------
        TextView tvDT = new TextView(this);
        tvDT.setText("Day and Time");
        tvDT.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Dtm = new GridLayout.LayoutParams(row2,col3);
        tvDT.setTextSize(12);
        tvDT.setTextColor(Color.BLACK);
        tvDT.setBackgroundColor(Color.WHITE);
        tvDT.setGravity(Gravity.CENTER_VERTICAL);
        Dtm.width = 700;
        Dtm.setMargins(5,5,5,5);
        tvDT.setLayoutParams(Dtm);
        grid1.addView(tvDT);
        //-----------------
        TextView tvCO = new TextView(this);
        tvCO.setText("C1");
        tvCO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams c1 = new GridLayout.LayoutParams(row3,col2);
        tvCO.setTextSize(12);
        tvCO.setTextColor(Color.BLACK);
        tvCO.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvCO.setGravity(Gravity.CENTER_HORIZONTAL);
        c1.width = 500;
        c1.setMargins(5,5,5,5);
        tvCO.setLayoutParams(c1);
        grid1.addView(tvCO);
        //------------------
        TextView tvAO = new TextView(this);
        tvAO.setText("A1");
        tvAO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams a1 = new GridLayout.LayoutParams(row3,col3);
        tvAO.setTextSize(12);
        tvAO.setTextColor(Color.BLACK);
        tvAO.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvAO.setGravity(Gravity.CENTER_HORIZONTAL);
        a1.width = 700;
        a1.setMargins(5,5,5,5);
        tvAO.setLayoutParams(a1);
        grid1.addView(tvAO);
        //-------------
        TextView tvNo = new TextView(this);
        tvNo.setText("");
        tvNo.setTypeface(null,Typeface.BOLD);
        GridLayout.Spec row5 = GridLayout.spec(4);
        GridLayout.LayoutParams Wn = new GridLayout.LayoutParams(row4,col1);
        tvNo.setTextSize(12);
        tvNo.setTextColor(Color.BLACK);
        tvNo.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvNo.setGravity(Gravity.CENTER_HORIZONTAL);
        Wn.width = 200;
        Wn.setMargins(5,5,5,5);
        tvNo.setLayoutParams(Wn);
        grid1.addView(tvNo);
        //------------
        TextView tvMm = new TextView(this);
        tvMm.setText("min <= hour && hour <= max");
        tvMm.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Min = new GridLayout.LayoutParams(row4,col2);
        tvMm.setTextSize(10);
        tvMm.setTextColor(Color.BLACK);
        tvMm.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvMm.setGravity(Gravity.CENTER_HORIZONTAL);
        Min.width = 500;
        Min.setMargins(1,1,1,1);
        tvMm.setLayoutParams(Min);
        grid1.addView(tvMm);
        //--------------
        TextView tvSys = new TextView(this);
        tvSys.setText("System.out.printIn(greeting+,\"World!\"");
        tvSys.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Sy = new GridLayout.LayoutParams(row4,col3);
        tvSys.setTextSize(12);
        tvSys.setTextColor(Color.BLACK);
        tvSys.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvSys.setGravity(Gravity.CENTER_HORIZONTAL);
        Sy.width = 700;
        Sy.setMargins(5,5,5,5);
        tvSys.setLayoutParams(Sy);
        grid1.addView(tvSys);
        //----Grid 2 for 4 columns
        GridLayout grid2 = new GridLayout(this);
        grid2.setRowCount(11);
        grid2.setColumnCount(4);
        GridLayout.Spec row6 = GridLayout.spec(5);
        GridLayout.Spec row7 = GridLayout.spec(6);
        GridLayout.Spec row8 = GridLayout.spec(7);
        GridLayout.Spec row9 = GridLayout.spec(8);
        GridLayout.Spec row10 = GridLayout.spec(9);
        GridLayout.Spec row11 = GridLayout.spec(10);
        //
        TextView tvRL = new TextView(this);
        tvRL.setText("");
        tvRL.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams RU = new GridLayout.LayoutParams(row6,col1);
        tvRL.setTextSize(12);
        tvRL.setTextColor(Color.BLACK);
        tvRL.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvRL.setGravity(Gravity.CENTER_VERTICAL);
        RU.width = 200;
        RU.setMargins(5,5,5,5);
        tvRL.setLayoutParams(RU);
        grid2.addView(tvRL);
        //-------------------
        TextView tvFm = new TextView(this);
        tvFm.setText("int min");
        tvFm.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Fr = new GridLayout.LayoutParams(row6,col2);
        tvFm.setTextSize(12);
        tvFm.setTextColor(Color.BLACK);
        tvFm.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvFm.setGravity(Gravity.CENTER_HORIZONTAL);
        Fr.width = 240;
        Fr.setMargins(5,5,5,5);
        tvFm.setLayoutParams(Fr);
        grid2.addView(tvFm);
        //--------------------
        TextView tvT = new TextView(this);
        tvT.setText("int max");
        tvT.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams To = new GridLayout.LayoutParams(row6,col3);
        tvT.setTextSize(12);
        tvT.setTextColor(Color.BLACK);
        tvT.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvT.setGravity(Gravity.CENTER_HORIZONTAL);
        To.width = 240;
        To.setMargins(5,5,5,5);
        tvT.setLayoutParams(To);
        grid2.addView(tvT);
        //---------
        TextView tvGt = new TextView(this);
        tvGt.setText("String Greeting");
        tvGt.setTypeface(null,Typeface.BOLD);
        GridLayout.Spec col4 = GridLayout.spec(3);
        GridLayout.LayoutParams Gng = new GridLayout.LayoutParams(row6,col4);
        tvGt.setTextSize(12);
        tvGt.setTextColor(Color.BLACK);
        tvGt.setBackgroundColor(Color.parseColor("#C9FFFF"));
        tvGt.setGravity(Gravity.CENTER_HORIZONTAL);
        Gng.width = 705;
        Gng.setMargins(5,5,5,5);
        tvGt.setLayoutParams(Gng);
        grid2.addView(tvGt);
        //--------------
        TextView tvR10 = new TextView(this);
        tvR10.setText("Rule");
        tvR10.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams R1 = new GridLayout.LayoutParams(row7,col1);
        tvR10.setTextSize(12);
        tvR10.setTextColor(Color.BLACK);
        tvR10.setBackgroundColor(Color.WHITE);
        tvR10.setGravity(Gravity.CENTER_VERTICAL);
        R1.width = 200;
        R1.setMargins(5,5,5,5);
        tvR10.setLayoutParams(R1);
        grid2.addView(tvR10);
        //-------
        TextView tvR20 = new TextView(this);
        tvR20.setText("R10");
        tvR20.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams R2 = new GridLayout.LayoutParams(row8,col1);
        tvR20.setTextSize(12);
        tvR20.setTextColor(Color.BLACK);
        tvR20.setBackgroundColor(Color.WHITE);
        tvR20.setGravity(Gravity.CENTER_VERTICAL);
        R2.width = 200;
        R2.setMargins(5,5,5,5);
        tvR20.setLayoutParams(R2);
        grid2.addView(tvR20);
        //----------
        TextView tvR30 = new TextView(this);
        tvR30.setText("R20");
        tvR30.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams R3 = new GridLayout.LayoutParams(row9,col1);
        tvR30.setTextSize(12);
        tvR30.setTextColor(Color.BLACK);
        tvR30.setBackgroundColor(Color.WHITE);
        tvR30.setGravity(Gravity.CENTER_VERTICAL);
        R3.width = 200;
        R3.setMargins(5,5,5,5);
        tvR30.setLayoutParams(R3);
        grid2.addView(tvR30);
        //----------
        TextView tvR40 = new TextView(this);
        tvR40.setText("R30");
        tvR40.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams R4 = new GridLayout.LayoutParams(row10,col1);
        tvR40.setTextSize(12);
        tvR40.setTextColor(Color.BLACK);
        tvR40.setBackgroundColor(Color.WHITE);
        tvR40.setGravity(Gravity.CENTER_VERTICAL);
        R4.width = 200;
        R4.setMargins(5,5,5,5);
        tvR40.setLayoutParams(R4);
        grid2.addView(tvR40);
        //
        TextView tvR41 = new TextView(this);
        tvR41.setText("R40");
        tvR41.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams R5 = new GridLayout.LayoutParams(row11,col1);
        tvR41.setTextSize(12);
        tvR41.setTextColor(Color.BLACK);
        tvR41.setBackgroundColor(Color.WHITE);
        tvR41.setGravity(Gravity.CENTER_VERTICAL);
        R5.width = 200;
        R5.setMargins(5,5,5,5);
        tvR41.setLayoutParams(R5);
        grid2.addView(tvR41);
        //--------------
        TextView tvfrom = new TextView(this);
        tvfrom.setText("From");
        tvfrom.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams zero = new GridLayout.LayoutParams(row7,col2);
        tvfrom.setTextSize(12);
        tvfrom.setTextColor(Color.BLACK);
        tvfrom.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvfrom.setGravity(Gravity.CENTER_VERTICAL);
        zero.width = 240;
        zero.setMargins(5,5,5,5);
        tvfrom.setLayoutParams(zero);
        grid2.addView( tvfrom);
        //-----------------
        TextView tvzero = new TextView(this);
        tvzero.setText("0");
        tvzero.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Twelve = new GridLayout.LayoutParams(row8,col2);
        tvzero.setTextSize(12);
        tvzero.setTextColor(Color.BLACK);
        tvzero.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvzero.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Twelve.width = 240;
        Twelve.setMargins(5,5,5,5);
        tvzero.setLayoutParams(Twelve);
        grid2.addView( tvzero );
        //------------------
        TextView tvEt = new TextView(this);
        tvEt.setText("12");
        tvEt.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Eit = new GridLayout.LayoutParams(row9,col2);
        tvEt.setTextSize(12);
        tvEt.setTextColor(Color.BLACK);
        tvEt.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvEt.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Eit.width = 240;
        Eit.setMargins(5,5,5,5);
        tvEt.setLayoutParams(Eit);
        grid2.addView(tvEt);
        //--------------
        TextView tvTT = new TextView(this);
        tvTT.setText("18");
        tvTT.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams TwT = new GridLayout.LayoutParams(row10,col2);
        tvTT.setTextSize(12);
        tvTT.setTextColor(Color.BLACK);
        tvTT.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvTT.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        TwT.width = 240;
        TwT.setMargins(5,5,5,5);
        tvTT.setLayoutParams(TwT);
        grid2.addView(tvTT);
        //--------------
        TextView tvTwD = new TextView(this);
        tvTwD.setText("22");
        tvTwD.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams TD = new GridLayout.LayoutParams(row11,col2);
        tvTwD.setTextSize(12);
        tvTwD.setTextColor(Color.BLACK);
        tvTwD.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvTwD.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        TD.width = 240;
        TD.setMargins(5,5,5,5);
        tvTwD.setLayoutParams(TD);
        grid2.addView(tvTwD);
        //-------
        TextView tvTO = new TextView(this);
        tvTO.setText("To");
        tvTO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams El = new GridLayout.LayoutParams(row7,col3);
        tvTO.setTextSize(12);
        tvTO.setTextColor(Color.BLACK);
        tvTO.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvTO.setGravity(Gravity.CENTER_VERTICAL);
        El.width = 240;
        El.setMargins(5,5,5,5);
        tvTO .setLayoutParams(El);
        grid2.addView(tvTO);
        //-----------------
        TextView tvST = new TextView(this);
        tvST.setText("11");
        tvST.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Stn = new GridLayout.LayoutParams(row8,col3);
        tvST.setTextSize(12);
        tvST.setTextColor(Color.BLACK);
        tvST.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvST.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Stn.width = 240;
        Stn.setMargins(5,5,5,5);
        tvST.setLayoutParams(Stn);
        grid2.addView( tvST );
        //------------------
        TextView tvSvteen = new TextView(this);
        tvSvteen.setText("17");
        tvSvteen.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams twn = new GridLayout.LayoutParams(row9,col3);
        tvSvteen.setTextSize(12);
        tvSvteen.setTextColor(Color.BLACK);
        tvSvteen.setBackgroundColor(Color.parseColor("#FEFE9A"));
        tvSvteen.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        twn.width = 240;
        twn.setMargins(5,5,5,5);
        tvSvteen.setLayoutParams(twn);
        grid2.addView(tvSvteen);
        //--------------
        TextView Tee1 = new TextView(this);
        Tee1.setText("21");
        Tee1.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams perms = new GridLayout.LayoutParams(row10,col3);
        Tee1.setTextSize(12);
        Tee1.setTextColor(Color.BLACK);
        Tee1.setBackgroundColor(Color.parseColor("#FEFE9A"));
        Tee1.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        perms.width = 240;
        perms.setMargins(5,5,5,5);
        Tee1.setLayoutParams(perms);
        grid2.addView(Tee1);
        //-------------------------
        TextView Tee3 = new TextView(this);
        Tee3.setText("23");
        Tee3.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams Three = new GridLayout.LayoutParams(row11,col3);
        Tee3.setTextSize(12);
        Tee3.setTextColor(Color.BLACK);
        Tee3.setBackgroundColor(Color.parseColor("#FEFE9A"));
        Tee3.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Three.width = 240;
        Three.setMargins(5,5,5,5);
        Tee3.setLayoutParams(Three);
        grid2.addView(Tee3);
        //----------------------
        TextView tvGreet = new TextView(this);
        tvGreet.setText("Greeting");
        tvGreet.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GoM = new GridLayout.LayoutParams(row7,col4);
        tvGreet.setTextSize(12);
        tvGreet.setTextColor(Color.BLACK);
        tvGreet.setBackgroundColor(Color.parseColor("#FFCB99"));
        tvGreet.setGravity(Gravity.CENTER_VERTICAL);
        GoM.width = 705;
        GoM.setMargins(5,5,5,5);
        tvGreet.setLayoutParams( GoM);
        grid2.addView(tvGreet);
        //-------------
        TextView tvGm = new TextView(this);
        tvGm.setText("Good Morning");
        tvGm.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GoA = new GridLayout.LayoutParams(row8,col4);
        tvGm.setTextSize(12);
        tvGm.setTextColor(Color.BLACK);
        tvGm.setBackgroundColor(Color.parseColor("#FFCB99"));
        tvGm.setGravity(Gravity.CENTER_VERTICAL);
        GoA.width = 705;
        GoA.setMargins(5,5,5,5);
        tvGm.setLayoutParams( GoA);
        grid2.addView(tvGm);
        //-------------
        TextView tvGa = new TextView(this);
        tvGa.setText("Good Afternoon");
        tvGa.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GoE = new GridLayout.LayoutParams(row9,col4);
        tvGa.setTextSize(12);
        tvGa.setTextColor(Color.BLACK);
        tvGa.setBackgroundColor(Color.parseColor("#FFCB99"));
        tvGa.setGravity(Gravity.CENTER_VERTICAL);
        GoE.width = 705;
        GoE.setMargins(5,5,5,5);
        tvGa.setLayoutParams( GoE);
        grid2.addView(tvGa);
        //-------------
        TextView tvGe = new TextView(this);
        tvGe.setText("Good Evening");
        tvGe.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GoN = new GridLayout.LayoutParams(row10,col4);
        tvGe.setTextSize(12);
        tvGe.setTextColor(Color.BLACK);
        tvGe.setBackgroundColor(Color.parseColor("#FFCB99"));
        tvGe.setGravity(Gravity.CENTER_VERTICAL);
        GoN.width = 705;
        GoN.setMargins(5,5,5,5);
        tvGe.setLayoutParams( GoN);
        grid2.addView(tvGe);
        //---------------
        TextView tvGN = new TextView(this);
        tvGN.setText("Good Night");
        tvGN.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GN = new GridLayout.LayoutParams(row11,col4);
        tvGN.setTextSize(12);
        tvGN.setTextColor(Color.BLACK);
        tvGN.setBackgroundColor(Color.parseColor("#FFCB99"));
        tvGN.setGravity(Gravity.CENTER_VERTICAL);
        GN.width = 705;
        GN.setMargins(5,5,5,5);
        tvGN.setLayoutParams( GN);
        grid2.addView(tvGN);
        //-------------
        lay.addView(grid1);
        lay.addView(grid2);

        sv.addView(lay);

        //setContentView(sv);
        //To use the xml file uncomment it and comment out the code above
        setContentView(R.layout.assignment_one);
    }
}
