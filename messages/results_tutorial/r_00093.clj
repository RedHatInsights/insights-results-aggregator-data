{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "pass" [],
    "reports"
      [{"component"
                "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
              "details"
                {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                 "info"
                   {"condition" "Degraded",
                    "lastTransitionTime" "2019-12-18T06:10:39Z",
                    "message"
                      "Samples installed at 4.2.0, with image import failures for these imagestreams: jboss-datagrid65-openshift dotnet jboss-datagrid72-openshift java fuse7-console jboss-eap70-openshift fis-karaf-openshift fis-java-openshift apicurito-ui jboss-decisionserver64-openshift jboss-eap71-openshift fuse-apicurito-generator dotnet-runtime jboss-datagrid65-client-openshift eap-cd-openshift apicast-gateway jboss-webserver30-tomcat7-openshift jboss-datagrid73-openshift jenkins jboss-webserver50-tomcat9-openshift jboss-amq-63 openjdk-11-rhel7 mysql jboss-fuse70-java-openshift jboss-fuse70-eap-openshift jenkins-agent-nodejs jboss-datavirt64-driver-openshift jboss-webserver30-tomcat8-openshift jboss-eap64-openshift jboss-eap72-openshift python fuse7-karaf-openshift nginx httpd jboss-webserver31-tomcat7-openshift postgresql php redhat-openjdk18-openshift modern-webapp jboss-fuse70-console jboss-datagrid71-openshift mariadb jboss-datagrid71-client-openshift jenkins-agent-maven rhdm73-decisioncentral-openshift redis golang redhat-sso70-openshift jboss-amq-62 mongodb jboss-datavirt64-openshift rhpam73-businesscentral-indexing-openshift perl redhat-sso71-openshift rhdm73-optaweb-employee-rostering-openshift rhpam73-businesscentral-monitoring-openshift fuse7-java-openshift fuse7-eap-openshift nodejs rhdm73-decisioncentral-indexing-openshift jboss-fuse70-karaf-openshift rhdm73-kieserver-openshift jboss-processserver64-openshift redhat-sso73-openshift redhat-sso72-openshift rhpam73-businesscentral-openshift jboss-webserver31-tomcat8-openshift ruby ",
                    "name" "openshift-samples",
                    "reason" "FailedImageImports"},
                 "kcs" "https://access.redhat.com/solutions/4563171",
                 "type" "rule"},
              "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
              "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
              "rule_id"
                "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
              "tags" [],
              "type" "rule"}],
    "skips"
      [{"details"
                "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
              "reason" "MISSING_REQUIREMENTS",
              "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                                    "reason" "MISSING_REQUIREMENTS",
                                    "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                                    "type" "skip"} {"details"
                                                            "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                                                          "reason" "MISSING_REQUIREMENTS",
                                                          "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                                                          "type" "skip"} {"details"
                                                                                  "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                                                                                "type" "skip"} {"details"
                                                                                                        "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                      "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                                                                                                      "type" "skip"} {"details" "All: ['ccx_ocp_core.models.proxy.Proxy'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
                                                                                                                            "type" "skip"} {"details"
                                                                                                                                                    "All: ['ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.cluster_wide_proxy'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn"
                                                                                                                                                    "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                                                                                                                                                  "type" "skip"} {"details"
                                                                                                                                                                          "All: ['ccx_ocp_core.utils.affected_version.ensure_is_affected_condition.<locals>.version_condition'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1798049.report",
                                                                                                                                                                        "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                                                                                                                                                                                              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                                                                                                                                                                                                                    "type" "skip"} {"details"
                                                                                                                                                                                                                                            "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn"
                                                                                                                                                                                                                                            "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                                                                                                                                                                                                                                          "type" "skip"} {"details"
                                                                                                                                                                                                                                                                  "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                "rule_fqdn"
                                                                                                                                                                                                                                                                  "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                                                                                                                                                                                                                                                                "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                        "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: ",
                                                                                                                                                                                                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                      "rule_fqdn"
                                                                                                                                                                                                                                                                                        "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                                                                                                                                                                                                                                                                                      "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                                              "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                            "rule_fqdn"
                                                                                                                                                                                                                                                                                                              "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                                                                                                                                                                                                                                                                                                            "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}
