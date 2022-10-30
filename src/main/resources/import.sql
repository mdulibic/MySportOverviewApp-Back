INSERT INTO team (name, goals, points) VALUES ('Dinamo', 5, 20);
INSERT INTO team (name, goals, points) VALUES ('Gorica',2, 17);
INSERT INTO team (name, goals, points) VALUES ('Hajduk',2, 15);
INSERT INTO team (name, goals, points) VALUES ('Istra 1961',4, 18);
INSERT INTO team (name, goals, points) VALUES ('Lokomotiva', 2, 9);
INSERT INTO team (name, goals, points) VALUES ('Osijek',2, 4);
INSERT INTO team (name, goals, points) VALUES ('Šibenik',3, 23);
INSERT INTO team (name, goals, points) VALUES ('Rijeka',2, 8);
INSERT INTO team (name, goals, points) VALUES ('Slaven Belupo',1, 9);
INSERT INTO team (name, goals, points) VALUES ('Varaždin',2, 10);

INSERT INTO round(id, name) VALUES (1, 'Round 1');
INSERT INTO round(id, name) VALUES (2, 'Round 2');
INSERT INTO round(id, name) VALUES (16, 'Round 16');
INSERT INTO round(id, name) VALUES (17, 'Round 17');

INSERT INTO comments(name, message, league_round_id) VALUES ('mdulibic', 'test komentar', 16);

INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Hajduk', 'Osijek', '05.11. 17:30', 16);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Dinamo', 'Šibenik', '06.11. 17:10', 16);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Varaždin', 'Rijeka', '06.11. 15:00', 16);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Istra 1961', 'Gorica', '04.11. 18:00', 16);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Slaven Belupo', 'Lokomotiva', '05.11. 15:00', 16);

INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Slaven Belupo', 'Hajduk', '12.11. 17:30', 17);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Lokomotiva', 'Istra 1961', '12.11. 15:00', 17);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Gorica', 'Varaždin', '13.11. 12:55', 17);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Rijeka', 'Dinamo', '13.11. 17:30', 17);
INSERT INTO timetable (team1, team2, time_and_date, league_round_id) VALUES ('Šibenik', 'Osijek', '13.11. 15:00', 17);

INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Šibenik', 'Istra 1961', 0, 2, 1);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Varaždin', 'Slaven Belupo', 0, 1, 1);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Dinamo', 'Lokomotiva', 3, 2, 1);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Osijek', 'Gorica', 2, 1, 1);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Šibenik', 'Rijeka', 0, 1, 1);

INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Hajduk', 'Rijeka', 2, 0, 2);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Gorica', 'Šibenik', 0, 0, 2);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Lokomotiva', 'Osijek', 2, 1, 2);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Slaven Belupo', 'Dinamo', 1, 5, 2);
INSERT INTO result (team1, team2, team1goals, team2goals, league_round_id) VALUES ('Istra', 'Varaždin', 0, 0, 2);