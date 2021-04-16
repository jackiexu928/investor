CREATE TABLE `investor` (
                        `id` bigint(128) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                        `name` varchar(32) NOT NULL COMMENT '姓名',
                        `mobile` bigint(11) default null COMMENT '手机号',
                        `email` varchar(64) NOT NULL COMMENT '邮箱',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='投资人表';

CREATE TABLE `investor_hold` (
                            `id` bigint(128) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                            `investor_id` bigint(128) NOT NULL COMMENT '投资人id',
                            `hold_fund` varchar(128) default null COMMENT '持有的基金code',
                            `hold_stock` varchar(256) default null COMMENT '持有的股票code',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='投资人持仓表';