package es.florida_uni.dam.practica2;


import android.content.Intent;
import android.util.Log;

import java.util.Random;

public class TareaMuyCostosa implements Runnable {

    final static String TAG = "SYP-practica2";


    @Override
    public void run() {
        Log.i(TAG, "Tarea muy costosa iniciada");

        //TODO: Interrumpir la ejecución cuando el usuario se haya cansado de esperar

            try {
                for (int i = 0; i < 100; i++) {

                    Log.i(TAG, "Tarea muy costosa en marcha...");
                    Thread.sleep(1000);

                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
            }


            Log.i(TAG, "Tarea muy costosa finalizada");

        }
    }





