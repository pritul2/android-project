package com.example.pritul.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected  TextView _text_result;
    static long value=0;
    double x [] = new double [500];
    char op[] = new char [500];
    int top_x=-1;
    int top_op=-1;
    double  calc()
    {
        double op1,op2;
        char oper;
        op1=x[top_x];
        top_x--;
        op2=x[top_x];
        top_x--;
        oper=op[top_op];
        top_op--;
        switch(oper) {
            case '+':
                top_x++;
                x[top_x] =
                        (op1 + op2);
                return (x[top_x]);

            case '-':
                top_x++;
                x[top_x] = (op2 - op1);
                return (x[top_x]);

            case '*':
                top_x++;
                x[top_x] = (op2 * op1);
                return (x[top_x]);

            case '/':
                top_x++;
                x[top_x] = (op2 / op1);
                return (x[top_x]);

            default:
                return 0;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView _text_id = (TextView) findViewById(R.id.text_id);
        _text_result = (TextView) findViewById(R.id.txt_result);
        ImageButton _btn_9 = (ImageButton) findViewById(R.id.btn_9);
        ImageButton _btn_8 = (ImageButton) findViewById(R.id.btn_8);
        ImageButton _btn_7 = (ImageButton) findViewById(R.id.btn_7);
        ImageButton _btn_6 = (ImageButton) findViewById(R.id.btn_6);
        ImageButton _btn_5 = (ImageButton) findViewById(R.id.btn_5);
        ImageButton _btn_4 = (ImageButton) findViewById(R.id.btn_4);
        ImageButton _btn_3 = (ImageButton) findViewById(R.id.btn_3);
        ImageButton _btn_2 = (ImageButton) findViewById(R.id.btn_2);
        ImageButton _btn_1 = (ImageButton) findViewById(R.id.btn_1);
        ImageButton _btn_0 = (ImageButton) findViewById(R.id.btn_0);
        final ImageButton _btn_add = (ImageButton) findViewById(R.id.btn_plus);
        ImageButton _btn_sub = (ImageButton) findViewById(R.id.btn_minus);
        ImageButton _btn_div = (ImageButton) findViewById(R.id.btn_div);
        ImageButton _btn_mul = (ImageButton) findViewById(R.id.btn_mul);
        Button _btn_clear = (Button) findViewById(R.id.btn_clr);
        ImageView _btn_equals = (ImageView) findViewById(R.id.btn_equals);
        //_btn_9.o
        _btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                top_x++;

                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"9";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    value=9;
                    x[top_x] = 9;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"8";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 8;
                    value = 8;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"7";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else{
                    top_x++;
                    x[top_x]=7;
                value=7;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"6";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 6;
                    value = 6;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });

        _btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"5";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 5;
                    value = 5;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"4";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 4;
                    value = 4;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"3";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 3;
                    value = 3;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"2";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 2;
                    value = 2;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"1";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 1;
                    value = 1;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //top_x++;
                if(value!=0)
                {
                    String _newValue=Long.toString(value);
                    _newValue=_newValue+"0";
                    value=Long.parseLong(_newValue);
                    x[top_x]=(double)value;

                }
                else {
                    top_x++;
                    x[top_x] = 0;
                    value = 0;
                }
                _text_result.setText(Double.toString(x[top_x]));
                _text_id.setText(Double.toString(x[top_x]));
                /*if(top_x>top_op && top_op!=-1)
                {
                    _text_result.setText(Double.toString( calc() ) );
                }*/
            }
        });
        _btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                top_op++;
                op[top_op]='+';
                _text_result.setText(Character.toString(op[top_op]));
                _text_id.setText(Character.toString(op[top_op]));
            }
        });
        _btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                top_op++;
                op[top_op]='*';
                value=0;
                _text_result.setText(Character.toString(op[top_op]));
                _text_id.setText(Character.toString(op[top_op]));
            }
        });
        _btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                top_op++;
                op[top_op]='-';
                _text_result.setText(Character.toString(op[top_op]));
                _text_id.setText(Character.toString(op[top_op]));
            }
        });
        _btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                top_op++;
                op[top_op]='/';
                _text_result.setText(Character.toString(op[top_op]));
                _text_id.setText(Character.toString(op[top_op]));
            }
        });
        _btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                top_op=-1;
                top_x=-1;
                value=0;
                _text_result.setText(Integer.toString(0));
                _text_id.setText(Integer.toString(0));
            }
        });
        _btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*int a=x[top_x];
                //_text_result.setText(Integer.toString(a));
                top_x--;
                int b=x[top_x];
                //_text_result.setText(Integer.toString(b));()
                top_x--;
                char c=op[top_op];
                //_text_result.setText(Character.toString(c));
                top_op--;
                int res=0;
                //res=a+b;
                //_text_result.setText(Integer.toString(res));
                //int res=0;*/
                value=0;
                if(top_x<=0 || top_op<0)
                    _text_result.setText("ERR");
                else
                    _text_result.setText(Double.toString( calc() ) );
                /*double res=0;
                double a=0;
                double b=0;
                char c='\0';
                while(top_x!=-1)
                {
                    if(top_x==-1) break;
                    a=x[top_x];
                    top_x--;
                    if(top_x==-1) break;
                    b=x[top_x];
                    top_x--;
                    if(top_op==-1) break;
                    c=op[top_op];
                    top_op--;
                    switch (c) {
                        case '+':
                            res = a + b;
                            top_x++;
                            x[top_x]=res;
                            break;
                        case '-':
                            res = b - a;
                            top_x++;
                            x[top_x]=res;
                            break;
                        case '*':
                            res = b * a;
                            top_x++;
                            x[top_x]=res;
                            break;
                        case '/':
                            res = b / a;
                            top_x++;
                            x[top_x]=res;
                            break;
                        default:
                            _text_result.setText(Integer.toString(0));

                    }
                }
                _text_result.setText(Double.toString(res));
                top_x++;
                x[top_x]=res;*/
            }
        });

    }
}
