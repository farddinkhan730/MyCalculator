package com.example.acer.mycalculator;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot,clr,plus,minus,divi,multi,sin,cose,tan,equal;
    EditText e1,e2;
    TextView t1;
    String data;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);

        t1 = (TextView) findViewById(R.id.textView);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button10);
        dot = (Button) findViewById(R.id.button11);
        clr = (Button) findViewById(R.id.button12);
        plus = (Button) findViewById(R.id.button13);
        minus = (Button) findViewById(R.id.button14);
        divi = (Button) findViewById(R.id.button15);
        multi = (Button) findViewById(R.id.button16);
        sin = (Button) findViewById(R.id.button17);
        cose = (Button) findViewById(R.id.button18);
        tan = (Button) findViewById(R.id.button19);
        equal = (Button) findViewById(R.id.button20);

        ts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.10f);
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "0");
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + "9");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e1.setText(e1.getText().toString() + ".");
                    }
                });

            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "0");
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + "9");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText().toString() + ".");
                    }
                });


            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                float f1 = Float.parseFloat(s1) + Float.parseFloat(s2);
                String result = Float.toString(f1);
                t1.setText(result);
                ts.speak(result, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "The result is " + result, Toast.LENGTH_SHORT).show();

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                float f1 = Float.parseFloat(s1) - Float.parseFloat(s2);
                String result = Float.toString(f1);
                t1.setText(result);
                ts.speak(result, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "The result is " + result, Toast.LENGTH_SHORT).show();

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                float f1 = Float.parseFloat(s1) / Float.parseFloat(s2);
                String result = Float.toString(f1);
                t1.setText(result);
                ts.speak(result, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "The result is " + result, Toast.LENGTH_SHORT).show();

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1)* Float.parseFloat(s2);
                String result=Float.toString(f1);
                t1.setText(result);
                ts.speak(result,TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, "The result is " + result, Toast.LENGTH_SHORT).show();

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double r=Math.tan(d);
                String res=Double.toString(r);
                ts.speak(res,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        cose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double r=Math.cos(d);
                String res=Double.toString(r);
                ts.speak(res,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                Double d=Double.parseDouble(s1);
                Double r=Math.sin(d);
                String res=Double.toString(r);
                ts.speak(res,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
    }
}
