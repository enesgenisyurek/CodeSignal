/*
Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.
*/

boolean solution(String name) {

    String pattern = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
    
    Pattern regexPattern = Pattern.compile(pattern);
    Matcher matcher = regexPattern.matcher(name);
    
    if (matcher.matches()) {
        return true;}
    return false;
    

}
