import com.evolveum.midpoint.xml.ns._public.common.common_3.ActivationStatusType
if (user?.activation?.administrativeStatus == ActivationStatusType.DISABLED) {
    return 'uid=' + name + ',ou=inactive,dc=simplifyiam,dc=com'
} else {
    return 'uid=' + name + ',ou=people,dc=simplifyiam,dc=com'
}
