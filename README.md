Email-Summarizer
================


Author
--------------
Zihang Li, lizihang00@gmail.com
  
  Chao Wang, 
  
  Yangpan Tao, yt724@nyu.edu

Description
--------------
A Email Summarizer implement with Gate and Java. Get the top 10 ranking TF-IDF words from the Email thread and find the Noun-Phase containing these TF-IDF words.

Main Tools
--------------
Gate Annie, Gate Tagger_NP_Chunker plugins, Eclipse

Results Evalustion
--------------
Some summarizations are shown in presentation slides. Results are good for tech/science topics and average for daily topics. The results have 70% performance as we expect. The drawback is the Gate plugin Tagger_NP_Chunker sometimes doesn't work so well, the performace mainly denpends on how good we process the result that generate by NP chunker.
Some uncommon words will rank high with TF-IDF techniques and then our program will take out the NP where the uncommon word belongs to, which is very very bad and misleading. 
In the future development, we can take out the sentence that has maximum number of TF-IDF words and Noun phases as the summarization of the entire email thread.








