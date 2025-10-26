class reverseWordsInStr {
    public String reverseWords(String s) {
        // Split string by whitespace using regex "\\s+"
        String[] words = s.trim().split("\\s+");
        
        // Reverse the array in-place
        Collections.reverse(Arrays.asList(words));

        // Join the words with a single space
        return String.join(" ", words);
    }
}
