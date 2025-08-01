void main() {
  List<String> elements = ["apple", "1231245", "banana"];
  List<String> uniqueElements = [];

  for (int i = 0; i < elements.length; i++) {
    String element = elements[i];
    Set<String> uniqueChars = {};
    Set<String> deletedChars = {};
    for (var char in element.split('')) {
      if (uniqueChars.contains(char)) {
        uniqueChars.remove(char);
        deletedChars.addAll(elements[i].split(char));
      } else {
        if (deletedChars.contains(char)) {
          uniqueChars.remove(char);
        } else {
          uniqueChars.add(char);
        }
      }
    }
    print(deletedChars);
    uniqueElements.add(uniqueChars.join());
  }
  print(uniqueElements);
}
