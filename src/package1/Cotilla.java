package package1;

public class Cotilla {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	function cifrar(myStr) {
		var h = 0;
		var o = "";
		var g;
		var f = myStr.length;
		var i;
		for (i=0; i<f; i++) {
		g = myStr.charCodeAt(i);
		h ^= (g << 2) ^ g;
		o += String.fromCharCode(h & 0xff);
		h >>= 8;
		}
		return = toHex(o);
		}
}

