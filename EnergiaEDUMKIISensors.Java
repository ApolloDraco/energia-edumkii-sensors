int yposition, xposition ;

void setup() {
  pinMode(40, OUTPUT);
  analogReadResolution(12);
}

void loop() {
  xposition = analogRead(23);
  yposition = analogRead(24);

  if ((yposition < 1950) || (yposition > 2150) || (xposition < 1950) || (xposition > 2150)) {
    tone(40, 800, 100);
  }
  
  delay(100);
}
