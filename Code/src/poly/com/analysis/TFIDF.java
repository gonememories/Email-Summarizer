package poly.com.analysis;

/**
 * Wrapper class that consists of all necessary information 
 * for calculating tf-idf value for each term.
 * Use method getValue() to get the actual tfidf value.
 * 
 * @author Zihang Li, Chao Wang, Yangpan Tao
 * @version 1.3  12/15/2013
 */
public class TFIDF implements Comparable<TFIDF> {
	
        private Number numOfOccurrences;
        private Number totalTermsInDocument;
        private Number totalDocuments;
        private Number numOfDocumentsWithTerm;
        
        /**
         * Constructor
         * @param occ  number of occurrence of a specific term
         * @param totTerms  total number of the terms
         * @param totDocs  total number of the documents
         * @param docsWithTerms number of documents that contains the term
         */
        public TFIDF(Number occ, Number totTerms, Number totDocs, Number docsWithTerms) {
                numOfOccurrences = occ;
                totalTermsInDocument = totTerms;
                totalDocuments = totDocs;
                numOfDocumentsWithTerm = docsWithTerms;
        }
        
        /**
         * Calculates the tf-idf value of the current term. For description of tf-idf 
         * Because there can be many cases where the current term is not present in any other 
         * document in the repository, Float.MIN_VALUE is added to the denominator to avoid
         * DivideByZero exception
         * @return weight  the tf-idf weight of the term
         */
        public Float getValue(){
                float tf = numOfOccurrences.floatValue() / (Float.MIN_VALUE + totalTermsInDocument.floatValue());
                float idf = (float) Math.log10(totalDocuments.floatValue() / (Float.MIN_VALUE + numOfDocumentsWithTerm.floatValue()));
                float weight = tf * idf;
                return weight;
        }
        
        /**
         * This method returns the number of occurrence of the term
         * @return the occurrence time
         */
        public int getNumOfOccurrences() {
                return this.numOfOccurrences.intValue();
        }
        
        /**
         * This method generates a string representation of the tf-idf weight
         * @return 
         */
        public String toString() {
                return this.getValue().toString();                        
        }
        
        @Override
        public int compareTo(TFIDF o) {
                if(this.getValue() - o.getValue()>0) return 1;
                else return -1;
        }
        
}