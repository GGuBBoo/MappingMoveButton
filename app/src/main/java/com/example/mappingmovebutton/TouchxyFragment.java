package com.example.mappingmovebutton;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class TouchxyFragment extends Fragment {

    MainActivity mainActivity1;

    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity1 = (MainActivity)getActivity();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_touchxy, container, false);
        // Inflate the layout for this fragment

        View Touchpad = rootview.findViewById(R.id.view1);

        Touchpad.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                if(action == MotionEvent.ACTION_DOWN) {
                    Log.d("test","손가락을 눌림 : "  + curX + ", " + curY);
                }
                else if (action == MotionEvent.ACTION_MOVE){
                    Log.d("test","손가락 움직임 : "  + curX + ", " + curY);
                }
                else if (action == MotionEvent.ACTION_UP){
                    Log.d("test","손가락 움직임 : "  + curX + ", " + curY);
                }

                return true;
            }
        });


        return rootview;
    }
}