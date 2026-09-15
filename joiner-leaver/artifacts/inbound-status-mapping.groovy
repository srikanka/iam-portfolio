import com.evolveum.midpoint.xml.ns._public.common.common_3.ActivationStatusType

if (input == 'Active') {
    return ActivationStatusType.ENABLED
} else {
    return ActivationStatusType.DISABLED
}
