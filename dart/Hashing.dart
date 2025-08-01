void main() {
  String str = "Banana";
  String newStr = str.toLowerCase();

  Set<String> ch = {};

  for (var char in newStr.split('')) {
    if (ch.contains(char)) {
      ch.remove(char);
    } else {
      ch.add(char);
    }
  }
  print(ch.join(''));
}
