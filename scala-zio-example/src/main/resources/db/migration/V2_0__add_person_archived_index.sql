ALTER TABLE person ADD is_archived BOOL DEFAULT FALSE NOT NULL;
CREATE INDEX `person_is_archived_idx` ON `person` (`is_archived`);



