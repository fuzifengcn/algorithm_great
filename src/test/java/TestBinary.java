import common.Tools;

public class TestBinary {


    public static void main(String[] args) {
        String sql = "\"XID\" in (\n" +
                "SELECT SubDepartment.\"XID\" AS SubdepartmentId FROM \"XOrganizationUnit\" SubDepartment,\n" +
                "\t\"XOrganizationUnit\" Department,\n" +
                "\t\"XOrganizationUnit\" Organizaition,\n" +
                "\t\"XOrganizationUnit\" OrganizaitionGroup\n" +
                "WHERE\n" +
                "\tDepartment.\"XID\" = SubDepartment.\"ParentXID\" \n" +
                "\tAND Organizaition.\"XID\" = Department.\"ParentXID\" \n" +
                "\tAND OrganizaitionGroup.\"XID\" = Organizaition.\"ParentXID\"\n" +
                "\tAND OrganizaitionGroup.\"XID\" = " +
                "\tAND SubDepartment.\"DataStatusXID\" <> 7\n" +
                "\t)\n" +
                "\tAND \"ExternalSourceId\" = ";
        System.out.println(sql);


    }
}
