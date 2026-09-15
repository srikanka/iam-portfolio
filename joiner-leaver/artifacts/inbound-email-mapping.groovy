import com.evolveum.midpoint.xml.ns._public.common.common_3.*
import java.text.Normalizer

def first = basic.getAttributeValue(account, 'firstname')
def last  = basic.getAttributeValue(account, 'lastname')
first = first == null ? '' : first.toString().trim()
last  = last  == null ? '' : last.toString().trim()

def deaccent = { s ->
    // decompose accented chars, strip the diacritic marks, then clean anything non-ascii
    def n = Normalizer.normalize(s, Normalizer.Form.NFD)
    n = n.replaceAll('\\p{InCombiningDiacriticalMarks}+', '')
    // handle German-specific ones NFD doesn't split (ß, and ae/oe/ue if you want that convention)
    n = n.replace('ß', 'ss')
    // strip anything still not a-z, A-Z, 0-9
    n = n.replaceAll('[^a-zA-Z0-9]', '')
    return n
}

def email = (deaccent(first) + '.' + deaccent(last)).toLowerCase() + '@simplifytech.com'
return email
