import java.util.regex.*;

class SqueakyClean {
  static String clean(String identifier) {
    String camel = Pattern.compile("-([a-z])")
                       .matcher(identifier)
                       .replaceAll(mr -> mr.group(1).toUpperCase());
    char[] asArray = camel.toCharArray();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < asArray.length; i++) {
      char ch = asArray[i];
      if (Character.isWhitespace(ch)) {
        ch = 95;
      } else if (Character.isDigit(ch)) {
        switch (ch) {
        case '4':
          ch = 'a';
          break;
        case '7':
          ch = 't';
          break;
        case '3':
          ch = 'e';
          break;
        case '0':
          ch = 'o';
          break;
        case '1':
          ch = 'l';
          break;
        default:
          // Skip other digits
          continue;
        }
      }
      // Only add letters and underscores
      if (Character.isLetter(ch) || ch == '_') {
        builder.append(ch);
      }
    }
    String buildString = builder.toString();
    return buildString;
  }
}
