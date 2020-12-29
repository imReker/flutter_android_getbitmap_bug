import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      builder: (context, child) {
        return Material(
          type: MaterialType.transparency,
          child: Container(
            alignment: Alignment.center,
            color: Colors.transparent,
            child: Container(
              width: 50,
              height: 50,
              color: Color.fromARGB(128, 255, 128, 64),
            ),
          ),
        );
      },
    );
  }
}
