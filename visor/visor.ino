int segmentos[]={2,3,4,5,6,7,8,9};
int digitos [][8]={
  {1,1,1,1,1,1,0,0}, //0
  {0,1,1,0,0,0,0,0}, //1
  {1,1,0,1,1,0,1,0}, //2
  {1,1,1,1,0,0,1,0}, //3
  {0,1,1,0,0,1,1,0}, //4
  {1,0,1,1,0,1,1,0}, //5
  {1,0,1,1,1,1,1,0}, //6
  {1,1,1,0,0,0,0,0}, //7
  {1,1,1,1,1,1,1,0}, //8
  {1,1,1,1,0,1,1,0} //9
};

void setup() {
  for(int i =0; i<8;i++){
    pinMode(segmentos[i],OUTPUT);
  }
pinMode  (A0, INPUT);
Serial.begin(9600);
}

void loop() {
int  potenciometro = analogRead(A0);
Serial.println(potenciometro);
int n=0;
if(potenciometro==0){
n=0  
} else {
  n=1;
}

for(int i=0;i<8;i++){
  digitalWrite(segmentos[i],digitos[n][i]);
}
}