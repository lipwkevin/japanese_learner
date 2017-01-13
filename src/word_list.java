import java.util.ArrayList;

public class word_list {
	
	String[] eng = {"a", "i", "u", "e", "o", "ka", "ki", "ku", "ke", "ko", "sa", "si", "su", "se", "so", "ta", "chi", "tsu", "te", "to", "na", "ni", "nu", "ne", "no", "ha", "hi", "hu", "he", "ho", "ma", "mi", "mu", "me", "mo", "ya", " ", "yu", " ", "yo", "ra", "ri", "ru", "re", "ro", "wa", "wi", " ", "we", "wo"};
	String[] hiragana = {"あ","い","う","え","お","か","き","く","け","こ","さ","し","す","せ","そ","た","ち","つ","て","と","な","に","ぬ","ね","の","は","ひ","ふ","へ","ほ","ま","み","む","め","も","や"," ","ゆ"," ","よ","ら","り","る","れ","ろ","わ","ゐ"," ","ゑ","を"};
	String[] katakana = {"ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","サ","シ","ス","セ","ソ","タ","チ","ツ","テ","ト","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ","マ","ミ","ム","メ","モ","ヤ"," ","ユ"," ","ヨ","ラ","リ","ル","レ","ロ","ワ","ヰ"," ","ヱ","ヲ"};
	static ArrayList<character> char_eng = new ArrayList();
	static ArrayList<character> char_hira = new ArrayList();
	static ArrayList<character> char_kata = new ArrayList();
	
	public word_list(){
		for(int i=0;i<eng.length;i++){
			char_eng.add(new character(eng[i],eng[i]));
			char_hira.add(new character(hiragana[i],eng[i]));
			char_kata.add(new character(katakana[i],eng[i]));;
		}
	}
	
	public static void main(String[] args){
		new word_list();
	}
}


