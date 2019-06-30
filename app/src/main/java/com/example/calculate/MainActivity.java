package com.example.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.*;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private StringBuilder stringExpression=new StringBuilder();//计算表达式字符
    private StringBuilder stringDisplay=new StringBuilder();//显示字符
    private String Result=new String("0");
          @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button) findViewById(R.id.button1);
       Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        Button button11=(Button) findViewById(R.id.button11);
        Button button21=(Button) findViewById(R.id.button21);
        Button button31=(Button) findViewById(R.id.button31);
        Button button41=(Button) findViewById(R.id.button41);
        Button button12=(Button) findViewById(R.id.button12);
        Button button22=(Button) findViewById(R.id.button22);
        Button button32=(Button) findViewById(R.id.button32);
        Button button42=(Button) findViewById(R.id.button42);
        Button button13=(Button) findViewById(R.id.button13);
        Button button23=(Button) findViewById(R.id.button23);
        Button button33=(Button) findViewById(R.id.button33);
        Button button43=(Button) findViewById(R.id.button43);
        Button button14=(Button) findViewById(R.id.button14);
        Button button24=(Button) findViewById(R.id.button24);
        Button button34=(Button) findViewById(R.id.button34);
        Button button44=(Button) findViewById(R.id.button44);
        button1.setOnClickListener(this);//按钮AC
        button2.setOnClickListener(this);//按钮()
        button3.setOnClickListener(this);//按钮%
        button4.setOnClickListener(this);//除法÷
        button11.setOnClickListener(this);//按钮7
        button21.setOnClickListener(this);//按钮8
        button31.setOnClickListener(this);//按钮9
        button41.setOnClickListener(this);//按钮×
        button12.setOnClickListener(this);//按钮4
        button22.setOnClickListener(this);//按钮5
        button32.setOnClickListener(this);//按钮6
        button42.setOnClickListener(this);//按钮-
        button13.setOnClickListener(this);//按钮1
        button23.setOnClickListener(this);//按钮2
        button33.setOnClickListener(this);//按钮3
        button43.setOnClickListener(this);//按钮+
        button14.setOnClickListener(this);//按钮0
        button24.setOnClickListener(this);//按钮.
        button34.setOnClickListener(this);//按钮clear
        button44.setOnClickListener(this);//按钮=


    }

    @Override
    public void onClick(View v) {
                  expressionJudge expressionjudge = new expressionJudge();//表达式处理
                  OperationExpression operationExpression = new OperationExpression();//表达式计算
                  TextView textView1 = (TextView) findViewById(R.id.textView1);//显示表达式
                  TextView textView2 = (TextView) findViewById(R.id.textView2);//显示计算结果
        try {
                  switch (v.getId()) {
                      case R.id.button1:
                          stringExpression.delete(0, stringExpression.length());
                          stringDisplay.delete(0, stringDisplay.length());
                          textView1.setText(stringDisplay.toString());
                          textView2.setText(stringExpression.toString());
                          Result="0";
                          break;
                      case R.id.button2:
                          expressionjudge.replace(stringDisplay, "()");//显示字符
                          expressionjudge.replace(stringExpression, "()");//运行表达式
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button3:
                          expressionjudge.replace(stringDisplay, "%");
                          expressionjudge.replace(stringExpression, "/100*");
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button4:
                          expressionjudge.replace(stringDisplay, "÷");
                          expressionjudge.replace(stringExpression, "/");
                          //stringExpression.append("/");
                          //stringDisplay.append("÷");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button11:
                          stringExpression.append("7");
                          stringDisplay.append("7");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button21:
                          stringExpression.append("8");
                          stringDisplay.append("8");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button31:
                          stringExpression.append("9");
                          stringDisplay.append("9");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button41:
                          expressionjudge.replace(stringDisplay, "×");
                          expressionjudge.replace(stringExpression, "*");
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button12:
                          stringExpression.append("4");
                          stringDisplay.append("4");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button22:
                          stringExpression.append("5");
                          stringDisplay.append("5");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button32:
                          stringExpression.append("6");
                          stringDisplay.append("6");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button42:
                          expressionjudge.replace(stringDisplay, "-");
                          expressionjudge.replace(stringExpression, "-");
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button13:
                          stringExpression.append("1");//表达式字符
                          stringDisplay.append("1");//添加显示字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button23:
                          stringExpression.append("2");
                          stringDisplay.append("2");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button33:
                          stringExpression.append("3");
                          stringDisplay.append("3");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button43:
                          expressionjudge.replace(stringDisplay, "+");
                          expressionjudge.replace(stringExpression, "+");
                          //stringExpression.append("+");
                          //stringDisplay.append("+");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button14:
                          stringExpression.append("0");
                          stringDisplay.append("0");//添加字符
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button24:
                          expressionjudge.replace(stringDisplay, ".");
                          expressionjudge.replace(stringExpression, ".");
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button34:
                          if (stringDisplay.length() != 0) {
                              stringDisplay.delete(stringDisplay.length() - 1, stringDisplay.length());//清除显示表达式的一个字符
                              stringExpression.delete(stringExpression.length() - 1, stringExpression.length());//清除表达式一个字符
                          }
                          textView1.setText(stringDisplay.toString());
                          break;
                      case R.id.button44:
                          if (stringExpression.length() == 0) break;

                          expressionjudge.replace(stringDisplay, "=");
                          if (!stringDisplay.toString().endsWith("="))
                              stringDisplay.append("=");//显示等于号

                          expressionjudge.replace(stringExpression, "=");
                          textView1.setText(stringDisplay.toString());

                          String[] stringArray = expressionjudge.stringArr(stringExpression.toString());//表达式字符数组

                          //*****日志***********//
                          Log.d("MainActivityE", stringExpression.toString());//打印表达式
                          for (int i = 0; i < stringArray.length; i++)
                              Log.d("MainActivityEA", stringArray[i]);//打印表达式数组
                          List<String> list = operationExpression.stringExpression(stringArray);
                          for (int i = 0; i < list.size(); i++)
                              Log.d("MainActivityRPN", list.get(i));//打印逆波兰式表达式数组
                          Log.d("MainActivityResult",operationExpression.ExceptionResult(stringArray));
                          //*****日志***********//
                          Result=operationExpression.DataJudge(operationExpression.ExceptionResult(stringArray));
                          textView2.setText(Result); //计算结果

                          stringDisplay.delete(0, stringDisplay.length());//清空显示缓存器
                          stringExpression.delete(0, stringExpression.length());//清空表达式寄存器
                          break;
                      default:
                          textView2.setText("err");
                          Result="0";
                          break;

                  }
              }catch (Exception e){
            textView2.setText("err");//捕捉错误
            stringDisplay.delete(0, stringDisplay.length());//清空显示缓存器
            stringExpression.delete(0, stringExpression.length());//清空表达式寄存器
            Result="0";
              }

    }
    public  class expressionJudge{//表达式处理
              boolean judge (String stringJudge){//运算符检测
                  return (stringJudge.endsWith("-") || stringJudge.endsWith("+") ||
                          stringJudge.endsWith("×") || stringJudge.endsWith("÷")||
                          stringJudge.endsWith("*") || stringJudge.endsWith("/") ||
                          stringJudge.endsWith("("));//不允许末尾连续出现的字符
              }

              //判断运算符是否输入正确
              StringBuilder replace(StringBuilder stringReplace,String symbol) {
                  char[] chars = stringReplace.toString().toCharArray();
                  boolean bool = false;
                  int index = 0;
                  int indexNo=0;
                  switch (symbol) {
                      case ".":
                          for (int i = 0; i < chars.length; i++) {
                              if (chars[i] == '.') {
                                  bool = true;
                                  index = i;
                              } else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/' ||
                                      chars[i] == '÷' || chars[i] == '×' && index < i) {
                                 bool = false;

                              }
                          }
                          if (!bool)stringReplace.append(symbol);
                          break;

                      case "=":
                          if (this.judge(stringReplace.toString()))
                              stringReplace.delete(stringReplace.length() - 1, stringReplace.length());//删除表达式最后不合法的运算符
                          else if (stringReplace.toString().endsWith("."))
                              stringReplace.append("0");
                          for (int i=0;i<chars.length;i++) {//补全右括号
                              if (chars[i] == '(')
                              stringReplace.append(")");
                               if (chars[i]==')')
                                  stringReplace.deleteCharAt(stringReplace.length()-1);
                          }
                          break;

                      case "()":
                          if (stringReplace.length()==0 || this.judge(stringReplace.toString()))
                              stringReplace.append("(");
                          else if (chars[chars.length-1]>47 && chars[chars.length-1]<58){
                            for (int i=0;i<chars.length;i++){//右括号不能大于左括号个数
                                if (chars[i]=='(') indexNo++;
                                if(chars[i]==')') indexNo--;
                            }
                              if (indexNo>0)stringReplace.append(")");
                          }
                        break;
                      default:
                          if (stringReplace.length() == 0) {
                              stringReplace.append(Result); //默认加上上次运算结果上次运算结果
                          } else if (this.judge(stringReplace.toString()))//末尾字符判断
                              stringReplace.delete(stringReplace.length() - 1, stringReplace.length());//开头检测到运算符删除
                          stringReplace.append(symbol);
                          break;
                  }
                      return stringReplace;
                  //重复字符自动删除在添加
              }


              String [] stringArr(String stringArr){//把字符串表达式转字符串数组方法
                  char [] chars=stringArr.toCharArray();
                  List<String> list=new ArrayList<>();
                  StringBuilder stringBuilderTmp=new StringBuilder();//临时数字字符存放


              for (int i=0;i<chars.length;i++){
                if(Character.isDigit(chars[i])|| chars[i]=='.'){
                    stringBuilderTmp.append(chars[i]);
                   if (i==chars.length-1 && stringBuilderTmp.length()>0) {//最后一项时把值搬移字符数组中
                        list.add(stringBuilderTmp.toString());
                        stringBuilderTmp.delete(0,stringBuilderTmp.length());
                    }
                }
                else {
                    //if (i == 0) {
                     //   list.add(String.valueOf(chars[i])); }
                    //else {
                       if (stringBuilderTmp.length()>0){//不为空
                           list.add(stringBuilderTmp.toString());
                           stringBuilderTmp.delete(0,stringBuilderTmp.length());
                       }
                        list.add( String.valueOf(chars[i]));
                    //}
                }

            }
             return this.minusJudge(list);
        }

        String [] minusJudge(List<String> list){//添加负数表达式方法
                  List<String> listTmp=new LinkedList<>();
                  int tmpIndex=0;
                  for (int i=0;i<list.size();i++)
                      listTmp.add(list.get(i));

                  for (int i=0;i<list.size();i++)
                      if (list.get(i).equals("-")) {//开头加括号
                          if (i == 0) {
                              listTmp.add(i+tmpIndex, "0");
                              listTmp.add(i+tmpIndex, "(");
                              listTmp.add(i+tmpIndex+4,")");
                              tmpIndex+=3;

                          }
                          else if (list.get(i-1).equals("+")||list.get(i-1).equals("-")||//中间加括号
                                  list.get(i-1).equals("*")||list.get(i-1).equals("/")){
                              listTmp.add(i+tmpIndex,"0");
                              listTmp.add(i+tmpIndex,"(");
                              listTmp.add(i+tmpIndex+4,")");
                              tmpIndex+=3;
                          }
                      }
                  int size=listTmp.size();
                  return listTmp.toArray(new String[size]);

        }

    }

    public class OperationExpression{//表达式计算
              public boolean judgeOperationSymbol(String JOstringSymbol){//判断是否时运算符
                  if (JOstringSymbol.equals("-") || JOstringSymbol.equals("+") ||
                  JOstringSymbol.equals("*") || JOstringSymbol.equals("/"))
                      return true;
                  else return false;

              }

              public int getPriority( String stringSymbol) {//获取运算符优先级
                 switch (stringSymbol) {
                     case "+":
                         return 1;
                     case "-":
                         return 1;
                     case "*":
                         return 2;
                     case "/":
                         return 2;
                     default:
                         return 0;
                 }
             }

             public double getResult(double parameterRight,double parameterLeft,String stringSymbol){//获取运算符计算结果
                 BigDecimal bigDecimalRight=new BigDecimal(Double.toString(parameterRight));//使用BigDecimal防止加减运算时精度丢失
                 BigDecimal bigDecimalLeft=new BigDecimal(Double.toString(parameterLeft));
                  switch (stringSymbol){
                      case "+":
                          return bigDecimalLeft.add(bigDecimalRight).doubleValue();
                      case "-":
                          return bigDecimalLeft.subtract(bigDecimalRight).doubleValue();
                      case "*":
                          return parameterLeft*parameterRight;
                          //return bigDecimalLeft.multiply(bigDecimalRight).doubleValue();
                      case "/":
                         return parameterLeft/parameterRight;
                          //return bigDecimalLeft.divide(bigDecimalRight,12,BigDecimal.ROUND_HALF_UP).doubleValue();
                      default: return -1;
                  }
             }

             public List<String> stringExpression(String[] strings) {//逆波兰式
                 Stack <String>stack = new Stack<>();
                 List<String> list = new ArrayList <>();
                 for (int i = 0; i < strings.length; i++) {
                     if (!judgeOperationSymbol(strings[i]) &&
                             !strings[i].equals("(") &&
                             !strings[i].equals(")"))//不是运算符和括号
                         list.add(strings[i]);

                     else if (strings[i].equals("("))//为z左括号
                         stack.push(strings[i]);

                     else if (judgeOperationSymbol(strings[i])) {//为操作运算符时
                         while (judgeOperationSymbol(strings[i])) {
                             if (stack.empty() || stack.peek().equals("(") ||
                                     getPriority((String) stack.peek()) < getPriority(strings[i])) {
                                 stack.push(strings[i]);
                                 break;
                             } else
                                 list.add((String) stack.pop());
                         }
                     }
                     else if (strings[i].equals(")")) {//为右括号时
                         while (!stack.peek().equals("("))
                             list.add((String) stack.pop());
                         stack.pop();
                     }
                 }
                 while (!stack.empty()) //栈不为空
                     list.add((String)stack.pop());
                 return list;
             }

            public String ExceptionResult(String[] strings){//后缀表达式计算
                  Stack <String>stack=new Stack<>();
                  List<String> list=this.stringExpression(strings);
                  for (int i=0;i<list.size();i++)
                      if(!judgeOperationSymbol(list.get(i)))//如果不是操作符进栈
                          stack.push(list.get(i));
                      else if(judgeOperationSymbol(list.get(i))){//遇到操作符
                          double result=getResult(Double.parseDouble(stack.pop()),Double.parseDouble(stack.pop()),list.get(i));
                          stack.push(String.valueOf(result));}
                     return stack.pop();
             }

             public String DataJudge(String stringR){//计算结果处理
                 if( Math.round(Double.parseDouble(stringR))-Double.parseDouble(stringR)==0)//不带小数点的返回整数
                     return String.valueOf((int) Double.parseDouble(stringR));
                 else if (stringR.equals("Infinity"))
                     return "除数不能为0";
                 else
                     return stringR;
             }

    }



}
